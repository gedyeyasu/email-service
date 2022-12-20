package com.miu.registration.integration;

import com.miu.registration.kafka.EmailMessage;

public interface EmailService {

    void sendMail(EmailMessage emailMessage);
}
