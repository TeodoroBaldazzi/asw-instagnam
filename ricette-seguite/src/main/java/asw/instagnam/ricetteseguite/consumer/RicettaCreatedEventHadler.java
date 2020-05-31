package asw.instagnam.ricetteseguite.consumer;

import asw.instagnam.common.Topic;
import asw.instagnam.common.event.DomainEvent;
import asw.instagnam.common.event.RicettaCreatedEvent;
import asw.instagnam.ricetteseguite.domain.RicetteSeguiteService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RicettaCreatedEventHadler {

    @Autowired
    private RicetteSeguiteService service;

    @KafkaListener(topics = {Topic.RICETTE_TOPIC})
    public void listen(ConsumerRecord<String, DomainEvent> evt){
        if(evt.value().getClass().equals(RicettaCreatedEvent.class)){
            RicettaCreatedEvent event = (RicettaCreatedEvent)evt.value();
            service.addRicetta(event.getId(), event.getAutore(), event.getTitolo());
        }
    }
}