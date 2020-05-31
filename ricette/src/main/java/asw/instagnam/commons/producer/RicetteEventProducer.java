package asw.instagnam.commons.producer;

import asw.instagnam.common.Topic;
import asw.instagnam.common.producer.KafkaEventProducer;

public class RicetteEventProducer extends KafkaEventProducer {

    @Override
    protected String getTopic() {
        return Topic.RICETTE_TOPIC;
    }
}
