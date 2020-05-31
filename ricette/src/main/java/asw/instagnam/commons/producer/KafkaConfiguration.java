package asw.instagnam.commons.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public RicetteEventProducer domainEventPublisher() {
        return new RicetteEventProducer();
    }
}