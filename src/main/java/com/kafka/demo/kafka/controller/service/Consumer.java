package com.kafka.demo.kafka.controller.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(
            topics = "kafkaDemo_Topic",
            groupId = "kafkaDemo_group")
    public void listenToTopic(String receivedMessage){
        System.out.println("The message received is " + receivedMessage);
    }
}
//The consumer will be listening to Kafka