package asw.instagnam.connessioni.domain;

import asw.instagnam.common.event.ConnessioneCreatedEvent;
import asw.instagnam.common.producer.KafkaEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ConnessioniService {

	private final ConnessioniRepository connessioniRepository;
	private final KafkaEventProducer producer;

	@Autowired
	public ConnessioniService(ConnessioniRepository connessioniRepository, KafkaEventProducer producer){
		this.connessioniRepository = connessioniRepository;
		this.producer = producer;
	}

 	public Connessione createConnessione(String follower, String followed) {
		Connessione connessione = new Connessione(follower, followed); 
		connessione = connessioniRepository.save(connessione);
		ConnessioneCreatedEvent event = new ConnessioneCreatedEvent(followed, follower);
		producer.produce(event);
		return connessione;
	}

 	public Connessione getConnessione(Long id) {
		Connessione connessione = connessioniRepository.findById(id).orElse(null);
		return connessione;
	}

 	public Collection<Connessione> getConnessioni() {
		Collection<Connessione> connessioni = connessioniRepository.findAll();
		return connessioni;
	}

	public Collection<Connessione> getConnessioniByFollower(String follower) {
		Collection<Connessione> connessioni = connessioniRepository.findAllByFollower(follower);
		return connessioni;
	}

}
