package com.neml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neml.service.Consumer;
import com.neml.service.Producer;

@RestController
@RequestMapping("/rest/api")
public class RestcontrollerMsg {
	
	@Autowired
	Producer producer;
	
	

	@PostMapping("/producerMsg")
	public String getMessageClient(@RequestParam  String message) {
		producer.sendMsgToTopic(message);
		
		return "Message sent to Kafka: " + message;
	}

	
	
}




   

