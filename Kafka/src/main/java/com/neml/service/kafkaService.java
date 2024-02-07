package com.neml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.neml.model.kafkaModel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
@Service
public class kafkaService {

	

@Autowired
	 KafkaTemplate<String, byte[]> kafkaTemplate;

	

    

    public void sendNewOrderRequest(kafkaModel kafkaModelReq) {
        byte[] serializedOrder = serializeObject(kafkaModelReq);
        if (serializedOrder != null) {
          kafkaTemplate.send("kafkatest", serializedOrder);
          System.out.println("Succesful send request");
        } else {
            System.err.println("Serialization failed for kafkaModelReq");
        }
    }

    private byte[] serializeObject(Object obj) {
        try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
             ObjectOutputStream objectOut = new ObjectOutputStream(byteOut)) {
            objectOut.writeObject(obj);
            return byteOut.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
