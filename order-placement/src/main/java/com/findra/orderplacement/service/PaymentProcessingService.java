package com.findra.orderplacement.service;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
@Scope("prototype")
public class PaymentProcessingService {
	
	private static final String URL = "payment_processors_api";
	
	@Transactional
	public boolean processPayment(Object paymentInfo) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> paymentProcessEntity = restTemplate.postForEntity(URL, paymentInfo, String.class);
		//String confirmationNumber = paymentProcessEntity.getBody();
		//TODO: save the confirmation number
		return paymentProcessEntity.getStatusCode().equals(HttpStatus.ACCEPTED);
	}

}
