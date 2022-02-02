package com.example.schaduling.service;

import com.example.schaduling.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class Poducer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "users";

    private KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedDelay = 5000)
    public void sendMessage() {
        Message message = new Message();
        message.setMsg("Message From " + LocalDateTime.now());
        log.error("Message with ID [{}], send widh time [{}]", message.getId(), message.getMsg());
        this.kafkaTemplate.send(TOPIC, message.getMsg());
    }
}
