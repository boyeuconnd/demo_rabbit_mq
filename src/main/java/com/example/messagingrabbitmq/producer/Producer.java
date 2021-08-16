package com.example.messagingrabbitmq.producer;


import com.example.messagingrabbitmq.config.MessageConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	private final RabbitTemplate rabbitTemplate;

	public Producer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sentMessage(String message){
		rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY,message);
	}


}
