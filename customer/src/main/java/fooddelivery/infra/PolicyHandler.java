package fooddelivery.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fooddelivery.config.kafka.KafkaProcessor;
import fooddelivery.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Orderaccepted'"
    )
    public void wheneverOrderaccepted_Notify(
        @Payload Orderaccepted orderaccepted
    ) {
        Orderaccepted event = orderaccepted;
        System.out.println(
            "\n\n##### listener Notify : " + orderaccepted + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Orderrejected'"
    )
    public void wheneverOrderrejected_Notify(
        @Payload Orderrejected orderrejected
    ) {
        Orderrejected event = orderrejected;
        System.out.println(
            "\n\n##### listener Notify : " + orderrejected + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Cookstarted'"
    )
    public void wheneverCookstarted_Notify(@Payload Cookstarted cookstarted) {
        Cookstarted event = cookstarted;
        System.out.println(
            "\n\n##### listener Notify : " + cookstarted + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Cookfinished'"
    )
    public void wheneverCookfinished_Notify(
        @Payload Cookfinished cookfinished
    ) {
        Cookfinished event = cookfinished;
        System.out.println(
            "\n\n##### listener Notify : " + cookfinished + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Picked'"
    )
    public void wheneverPicked_Notify(@Payload Picked picked) {
        Picked event = picked;
        System.out.println("\n\n##### listener Notify : " + picked + "\n\n");
        // Sample Logic //

    }
}
