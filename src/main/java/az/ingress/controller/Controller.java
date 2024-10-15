package az.ingress.controller;

import az.ingress.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class Controller {
    private final Producer producer;
    @PostMapping("/notifications")
    public void sendNotification(@RequestBody String notification) {
        producer.sendNotification(notification);
    }
}