package com.miu.registration.integration;

import com.miu.registration.kafka.EmailMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String sender;

    @Override
    public void sendMail(EmailMessage emailMessage) {
        try{
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo(emailMessage.getRecipient());
            mailMessage.setSubject(emailMessage.getSubject());
            mailMessage.setText(emailMessage.getMessageBody());

            javaMailSender.send(mailMessage);
            System.out.println("Mail sent Successfully to "+emailMessage.getRecipient());
        } catch (Exception e){
            System.out.println("Error sending mail");
        }
    }
}
