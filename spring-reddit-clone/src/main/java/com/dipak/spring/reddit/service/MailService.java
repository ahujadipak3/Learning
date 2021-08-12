package com.dipak.spring.reddit.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.dipak.spring.reddit.model.NotificationEmail;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MailService {

	private final JavaMailSender mailSender;

	@Async 
	public void sendMail(NotificationEmail notificationEmail) {

		MimeMessagePreparator messagePreparator = mimeMessage -> {
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
			mimeMessageHelper.setFrom("dipak@gmail.com");
			mimeMessageHelper.setTo(notificationEmail.getRecipient());
			mimeMessageHelper.setSubject(notificationEmail.getSubject());
			mimeMessageHelper.setText(notificationEmail.getBody());
		};
		mailSender.send(messagePreparator);

	}
}
