package com.som.home.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/content")
public class Content {
	
	@Autowired
	QueueProducer producer;
	
	@PostMapping
	public String getContent() {
		System.out.println("received post request");
		try {
			producer.produce();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}

}
