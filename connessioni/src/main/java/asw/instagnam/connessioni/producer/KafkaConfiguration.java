package asw.instagnam.connessioni.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public ConnessioniEventProducer domainEventPublisher() {
        return new ConnessioniEventProducer();
    }
}