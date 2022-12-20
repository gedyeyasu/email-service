package com.miu.emailservice.kafka;

import com.miu.emailservice.integration.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Receiver {
    @Autowired
    EmailSenderService emailSenderService;

    @KafkaListener(topics = {"topicA"})
    public void receiveEmailMessage(@Payload EmailMessage emailMessage){
        System.out.println("received new email message....");
        emailSenderService.sendMail(emailMessage);
    }

}
