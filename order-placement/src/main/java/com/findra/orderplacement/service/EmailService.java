package com.findra.orderplacement.service;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.findra.orderplacement.entity.Order;

@Service
@Scope("prototype")
public class EmailService {

	public boolean sendEmailToShippingDepartment(Order order) {

		Properties properties = System.getProperties();
		// add other properties
		// sender and others, make them static if possible
		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);
			// add message recipient, subject and body
			// generate them from order
			Transport.send(message);
			return true;
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean sendEmailConfiramtionToCustomer(Order order) {
		// TODO: add message recipient, subject and body
		// generate them from order
		return true;
	}

}
