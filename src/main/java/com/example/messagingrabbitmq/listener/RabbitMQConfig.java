package com.example.messagingrabbitmq.listener;

import com.example.messagingrabbitmq.config.MessageConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConfig {

    @RabbitListener(queues = MessageConfig.QUEUE)
    public void consumeMessage(String message){
        System.out.println("MESSAGE RECEIVED: "+message);
    }

}
