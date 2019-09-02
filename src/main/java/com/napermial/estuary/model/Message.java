package com.napermial.estuary.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Component
public class Message {
    public Message(String text, boolean userIsSeller) {
        date = LocalDateTime.now();
        this.text = text;
        this.userIsSeller = userIsSeller;
    }

    private LocalDateTime date;
    private String text;
    private boolean userIsSeller;
}
