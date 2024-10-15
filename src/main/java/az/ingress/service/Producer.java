package az.ingress.service;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Producer {
    private final AmqpTemplate amqpTemplate;

    public void sendNotification(String notification){
        amqpTemplate.convertAndSend("notificationExchange", "notification.routing.key", notification);
    }
}
