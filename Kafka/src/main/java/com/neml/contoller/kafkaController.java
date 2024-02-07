package com.neml.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neml.model.kafkaModel;



@RestController
@RequestMapping("/api")
public class kafkaController {
	
	
	@Autowired
	com.neml.service.kafkaService kafkaService;

	@PostMapping(value = "/NewOrder")
	public String  sendNewOrderRequest (@RequestBody kafkaModel kafkaModelReq) {
		kafkaService.sendNewOrderRequest(kafkaModelReq);
		return "Message sent to Kafka: " + kafkaModelReq.toString();
	
}
}