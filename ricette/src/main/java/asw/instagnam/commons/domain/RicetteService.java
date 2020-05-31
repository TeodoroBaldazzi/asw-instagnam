package asw.instagnam.commons.domain;

import asw.instagnam.common.event.RicettaCreatedEvent;
import asw.instagnam.commons.producer.RicetteEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RicetteService {

	private final RicetteRepository ricetteRepository;
	private final RicetteEventProducer producer;

	public RicetteService(RicetteRepository repository, RicetteEventProducer producer){
		this.ricetteRepository = repository;
		this.producer = producer;
	}

 	public RicettaCompleta createRicetta(String autore, String titolo, String preparazione) {
		RicettaCompleta ricetta = new RicettaCompleta(autore, titolo, preparazione); 
		ricetta = ricetteRepository.save(ricetta);
		producer.produce(new RicettaCreatedEvent(ricetta.getId(), autore, titolo));
		return ricetta;
	}

 	public RicettaCompleta getRicetta(Long id) {
		RicettaCompleta ricetta = ricetteRepository.findById(id).orElse(null);
		return ricetta;
	}

	public Collection<RicettaCompleta> getRicette() {
		Collection<RicettaCompleta> ricette = ricetteRepository.findAll();
		return ricette;
	}

	public Collection<RicettaCompleta> getRicetteByAutore(String autore) {
		Collection<RicettaCompleta> ricette = ricetteRepository.findAllByAutore(autore);
		return ricette;
	}

}
