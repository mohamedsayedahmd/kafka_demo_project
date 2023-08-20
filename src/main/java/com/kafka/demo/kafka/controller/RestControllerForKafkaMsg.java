package com.kafka.demo.kafka.controller;

import com.kafka.demo.kafka.controller.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/")
public class RestControllerForKafkaMsg {

    @Autowired
    Producer producer;

    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message){
        producer.sendMessageToTopic(message);
    }// message for the producer to say to the topic

}
