package asw.instagnam.common.producer;

import asw.instagnam.common.event.DomainEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public abstract class KafkaEventProducer implements Producer {

    @Autowired
    private KafkaTemplate<String, DomainEvent> template;

    protected abstract String getTopic();

    @Override
    public void produce(DomainEvent event) {
        template.send(getTopic(), event);
    }
}
