package com.miu.emailservice.integration;

import com.miu.emailservice.kafka.EmailMessage;

public interface EmailService {

    void sendMail(EmailMessage emailMessage);
}
