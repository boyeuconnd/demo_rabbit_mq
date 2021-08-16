package com.example.messagingrabbitmq.controller;

import com.example.messagingrabbitmq.producer.Producer;
import com.example.messagingrabbitmq.req.SendReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitController {

    private final Producer producer;

    public RabbitController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/sent")
    public String sentMessageToRabbit(@RequestBody SendReq req){
        producer.sentMessage(req.getMessage().toString());
        return "SUCCESS SENT";
    }
}
