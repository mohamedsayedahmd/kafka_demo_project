package com.kafka.demo.kafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/")
public class RestControllerForKafkaMsg {
    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message){

    }// message for the producer to say to the topic

}
