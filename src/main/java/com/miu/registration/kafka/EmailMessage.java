package com.miu.registration.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EmailMessage {

    private String recipient;
    private String messageBody;

    private String subject;
}
