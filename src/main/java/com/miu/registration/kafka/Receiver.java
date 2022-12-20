package com.miu.registration.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.miu.registration.integration.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Receiver {
    @Autowired
    EmailSenderService emailSenderService;

    @KafkaListener(topics = {"topicA"})
    public void receiveEmailMessage(@Payload EmailMessage emailMessage)  {
        emailSenderService.sendMail(emailMessage);
    }

}
