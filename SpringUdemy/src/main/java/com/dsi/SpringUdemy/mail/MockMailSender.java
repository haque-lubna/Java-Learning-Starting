package com.dsi.SpringUdemy.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;


public class MockMailSender implements MailSender {
	private static Log log = LogFactory.getLog(MockMailSender.class);
	@Override
	public void send(String to, String sub, String body) {
		// TODO Auto-generated method stub
		log.info("Sending Mock Mail to " + to);
		log.info("The Subject is " + sub);
		log.info("The Mail body is " + body);
	}

}
