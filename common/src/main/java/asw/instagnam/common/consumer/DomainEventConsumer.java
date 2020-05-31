package asw.instagnam.common.consumer;

import asw.instagnam.common.event.DomainEvent;

public interface DomainEventConsumer {
    void onEvent(DomainEvent event);
}
