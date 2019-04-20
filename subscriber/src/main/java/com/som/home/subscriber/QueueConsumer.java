package com.som.home.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	 public void receiveMessage(String message) {
		  logger.info("Received (String) " + message);
		  processMessage(message);
		 }

	private void processMessage(String message) {
		logger.info("received message to process is "+message);
	}
	
	
}
