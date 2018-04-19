package com.netas.httpstudentmessagehandlerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netas.httpstudentmessagehandlerservice.bus.producer.RabbitProducer;

@RestController
@MessageMapping
public class RabbitController {

	@Autowired
	RabbitProducer rabbitProducer;
	
	@GetMapping("/send/{message}")
	public void sendMessage(@PathVariable String message) {
		rabbitProducer.sendMessage(message);
	}
}
