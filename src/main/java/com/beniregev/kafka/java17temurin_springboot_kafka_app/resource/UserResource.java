package com.beniregev.kafka.java17temurin_springboot_kafka_app.resource;

import com.beniregev.kafka.java17temurin_springboot_kafka_app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class UserResource {

    private static final String TOPIC = "kafka-app-topic";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @GetMapping("/v1/publish/{name}")
    public String post(@PathVariable("name") final String name) {
        kafkaTemplate.send(TOPIC, new User(name, "R&D", 43210));
        return "Published successfully";

    }
}
