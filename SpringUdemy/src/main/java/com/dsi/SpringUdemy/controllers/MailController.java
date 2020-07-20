package com.dsi.SpringUdemy.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.SpringUdemy.mail.MailSender;
import com.dsi.SpringUdemy.mail.MockMailSender;

@RestController
public class MailController {
	
	private MailSender mailSender;
	
	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}



	@RequestMapping("/mail")
	public String mail() throws MessagingException  {
		mailSender.send("ovishek.paul@gmail.com", "sent mail using spring", "Hello man, See at last I am successful to give you a surprise without help any other except google :p . (kost kore english e likhechi. tuio kosto korebujhe nis okay?");
		return "Mail sent";
	}
}
