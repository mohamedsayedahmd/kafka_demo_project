package com.kafka.demo.kafka.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    // we what to send something to kafka ((KafkaTemplate))
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    public void sendMessageToTopic(String message){
        kafkaTemplate.send("kafkaDemo_Topic",message);
    }
}
// KafkaTemplate <nameOfTheTopic,message>