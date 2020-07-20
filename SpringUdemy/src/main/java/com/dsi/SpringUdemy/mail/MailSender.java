package com.dsi.SpringUdemy.mail;

import javax.mail.MessagingException;

public interface MailSender {
	void send(String to, String sub, String body) throws MessagingException;
}
