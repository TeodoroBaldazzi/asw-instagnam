package asw.instagnam.common.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfigurator {

    @Bean
    public DomainEventProducer domainEventPublisher() {
        return new DomainEventProducerImpl();
    }
}
