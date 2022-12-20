package com.miu.emailservice.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailMessage {

    private String recipient;
    private String messageBody;

    private String subject;
}
