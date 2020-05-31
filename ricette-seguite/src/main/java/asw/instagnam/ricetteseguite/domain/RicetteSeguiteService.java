package asw.instagnam.ricetteseguite.domain;

import asw.instagnam.ricetteseguite.domain.exceptions.UserNotFoundException;
import asw.instagnam.ricetteseguite.domain.repository.RicettaRepository;
import asw.instagnam.ricetteseguite.domain.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*; 

@Service 
public class RicetteSeguiteService {

	@Autowired
	private RicettaRepository ricettaRepository;
	@Autowired
	private UserRepository userRepository;

	public void addConnessione(String followedId, String followerId) {
		User followed = getOrCreateUser(followedId);
		User follower = getOrCreateUser(followerId);
		follower.addFollowing(followed);
	}

	public void addRicetta(Long id, String autore, String titolo) {
		User user = getOrCreateUser(autore);
		user.addRicetta(createRicetta(id, autore, titolo));
	}

	public Set<Ricetta> getRicetteSeguite(String utente) throws UserNotFoundException {
		return userRepository.findById(utente).orElseThrow(UserNotFoundException::new).getAllRicetteSeguite();
	}

	private User getOrCreateUser(String userId){
		return userRepository.findById(userId).orElse(userRepository.save(new User(userId)));
	}

	private Ricetta createRicetta(Long id, String autore, String titolo){
		return new Ricetta(id, autore, titolo);
	}
}
