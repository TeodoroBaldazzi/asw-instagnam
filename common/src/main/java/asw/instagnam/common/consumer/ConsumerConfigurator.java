package asw.instagnam.common.consumer;

import asw.instagnam.common.producer.DomainEventProducer;
import asw.instagnam.common.producer.DomainEventProducerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfigurator {

    @Bean
    public DomainEventConsumer domainEventConsumer() {
        return new DomainEventConsumerImpl();
    }
}
