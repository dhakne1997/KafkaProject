package com.neml.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.neml.model.kafkaModel;

@Service
public class Consumer {
	
	@KafkaListener(topics = "kafkatest")
	public void listenToTopic(String kafkaModel) {
		System.out.println("The message is recived :");
	}

}
