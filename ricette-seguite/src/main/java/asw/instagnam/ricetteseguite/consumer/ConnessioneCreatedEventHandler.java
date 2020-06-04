package asw.instagnam.ricetteseguite.consumer;

import asw.instagnam.common.Topic;
import asw.instagnam.common.event.ConnessioneCreatedEvent;
import asw.instagnam.common.event.DomainEvent;
import asw.instagnam.ricetteseguite.domain.RicetteSeguiteService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConnessioneCreatedEventHandler {

    private final RicetteSeguiteService service;

    @Autowired
    public ConnessioneCreatedEventHandler(RicetteSeguiteService service) {
        this.service = service;
    }

    @KafkaListener(topics = {Topic.CONNESSIONI_TOPIC})
    public void listen(ConsumerRecord<String, DomainEvent> evt){
        if(evt.value().getClass().equals(ConnessioneCreatedEvent.class)){
            ConnessioneCreatedEvent event = (ConnessioneCreatedEvent) evt.value();
            service.addConnessione(event.getFollowedId(), event.getFollowerId());
        }
    }
}