package asw.instagnam.common.producer;

import asw.instagnam.common.event.DomainEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class DomainEventProducerImpl implements DomainEventProducer {

    @Autowired
    private KafkaTemplate<String, DomainEvent> template;

    @Override
    public void produce(DomainEvent event, String channel) {
        template.send(channel, event);
    }
}
