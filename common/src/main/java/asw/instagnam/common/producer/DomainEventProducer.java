package asw.instagnam.common.producer;

import asw.instagnam.common.event.DomainEvent;

public interface DomainEventProducer {
    void produce(DomainEvent event, String channel);
}
