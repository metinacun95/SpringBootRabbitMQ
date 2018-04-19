package com.netas.httpstudentmessagehandlerservice.bus.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitProducer {
	
	@Autowired
	private SimpMessagingTemplate webSocket;
	
	@Autowired
	AmqpTemplate amqpTemplate;
	
	public void sendMessage(String message) {
		amqpTemplate.convertAndSend("kanal", message);
	}
}
