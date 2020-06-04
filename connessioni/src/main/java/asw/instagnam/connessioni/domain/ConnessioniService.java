package asw.instagnam.connessioni.domain;

import asw.instagnam.common.event.ConnessioneCreatedEvent;
import asw.instagnam.common.producer.KafkaEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
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
		return connessioniRepository.findById(id).orElse(null);
	}

 	public Collection<Connessione> getConnessioni() {
		return connessioniRepository.findAll();
	}

	public Collection<Connessione> getConnessioniByFollower(String follower) {
		return connessioniRepository.findAllByFollower(follower);
	}

}
