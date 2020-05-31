package asw.instagnam.common.consumer;

import asw.instagnam.common.event.DomainEvent;
import asw.instagnam.common.producer.DomainEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class DomainEventConsumerImpl implements DomainEventConsumer {

    @Autowired
    private KafkaTemplate<String, DomainEvent> template;


    @Override
    public void onEvent(DomainEvent event) {

    }
}
