package asw.instagnam.connessioni.producer;

import asw.instagnam.common.Topic;
import asw.instagnam.common.producer.KafkaEventProducer;

public class ConnessioniEventProducer extends KafkaEventProducer {

    @Override
    protected String getTopic() {
        return Topic.CONNESSIONI_TOPIC;
    }
}
