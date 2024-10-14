package az.ingress.queue;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Subscriber {

     @RabbitListener(queues = "notifications")
     public void receiveNotification(String notification){
        log.info("Received: {}", notification);
     }
}
