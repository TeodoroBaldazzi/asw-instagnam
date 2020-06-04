package asw.instagnam.ricetteseguite.domain;

import asw.instagnam.ricetteseguite.domain.entities.Connessione;
import asw.instagnam.ricetteseguite.domain.entities.Ricetta;
import asw.instagnam.ricetteseguite.domain.entities.RicetteSeguite;
import asw.instagnam.ricetteseguite.domain.repository.ConnessioneRepository;
import asw.instagnam.ricetteseguite.domain.repository.RicettaRepository;
import asw.instagnam.ricetteseguite.domain.repository.RicetteSeguiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RicetteSeguiteService {

	private final RicettaRepository ricettaRepository;
	private final ConnessioneRepository connessioneRepository;
	private final RicetteSeguiteRepository ricetteSeguiteRepository;

	@Autowired
	public RicetteSeguiteService(RicettaRepository ricettaRepository, ConnessioneRepository connessioneRepository, RicetteSeguiteRepository ricetteSeguiteRepository) {
		this.ricettaRepository = ricettaRepository;
		this.connessioneRepository = connessioneRepository;
		this.ricetteSeguiteRepository = ricetteSeguiteRepository;
	}

	public void addConnessione(String followedId, String followerId) {
		connessioneRepository.save(connessioneFactory(followedId, followerId));
		List<Ricetta> ricette = ricettaRepository.findAllByAutore(followedId);
		markRicetteAsFollowedBy(followerId, ricette);
	}

	public void addRicetta(Long id, String autore, String titolo) {
		ricettaRepository.save(ricettaFactory(id, autore, titolo));
		List<Connessione> connessioni = connessioneRepository.findAllByFollowed(autore);
		List<String> utenti = connessioni.stream().map(Connessione::getFollower).collect(Collectors.toList());
		markRicettaFollowedBy(id, autore, titolo, utenti);
	}

	public Collection<Ricetta> getRicetteSeguite(String followerId) {
		return ricetteSeguiteRepository.findAllByFollowerId(followerId)
				.stream().map(RicetteSeguite::getRicetta).collect(Collectors.toList());
	}

	private Connessione connessioneFactory(String followedId, String followerId) {
		return new Connessione(followedId, followerId);
	}

	private Ricetta ricettaFactory(Long id, String autore, String titolo){
		return new Ricetta(id, autore, titolo);
	}

	private RicetteSeguite ricetteSeguiteFactory(String followerId, Long ricettaId, String autoreId, String titolo){
		return new RicetteSeguite(followerId, ricettaId, autoreId, titolo);
	}

	private void markRicetteAsFollowedBy(String followerId, List<Ricetta> ricette) {
		ricette.stream().forEach(ricetta ->
				ricetteSeguiteRepository.save(ricetteSeguiteFactory(
						followerId,
						ricetta.getId(),
						ricetta.getAutore(),
						ricetta.getTitolo())));
	}

	private void markRicettaFollowedBy(Long id, String autore, String titolo, List<String> utenti) {
		utenti.stream().forEach(utente -> {
			ricetteSeguiteRepository.save(ricetteSeguiteFactory(
					utente,
					id,
					autore,
					titolo));
		});
	}
}
