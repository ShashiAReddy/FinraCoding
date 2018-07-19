package com.findra.orderplacement.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findra.orderplacement.entity.Order;
import com.findra.orderplacement.repository.OrderRepository;
import com.findra.orderplacement.service.EmailService;
import com.findra.orderplacement.service.InventoryService;
import com.findra.orderplacement.service.PaymentProcessingService;

@RestController
@RequestMapping("/api/rest")
public class OrderResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderResource.class);

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	InventoryService inventoryService;

	@Autowired
	PaymentProcessingService paymentProcessingService;

	@Autowired
	EmailService emailService;

	@Transactional						//does it need to be transaction here? Probabaly not
	@PostMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> submitOrder(@RequestBody(required = true) Order order) {
		LOGGER.debug("REST request to submit an order {}", order);
		if (inventoryService.checkInventory(order.getProduct().getId(), order.getQuantity())) {
			order = orderRepository.save(order);
			paymentProcessingService.processPayment(order.getPaymentInfo());
			emailService.sendEmailToShippingDepartment(order);
			emailService.sendEmailConfiramtionToCustomer(order);
			return new ResponseEntity<>(order.getObjectId(), HttpStatus.OK);  //return the order confirmation number
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE); // should be global exception handler
		}
	}

}
