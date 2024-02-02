package com.neml.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "kafkatest")
	public void listenToTopic(String message) {
		String s =message+"finaaaaaaaaaaaaaally";
		System.out.println("The message is recived :"+s);
	}

}


