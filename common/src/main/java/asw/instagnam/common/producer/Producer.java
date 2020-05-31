package asw.instagnam.common.producer;

import asw.instagnam.common.event.DomainEvent;

public interface Producer {
    void produce(DomainEvent event);
}
