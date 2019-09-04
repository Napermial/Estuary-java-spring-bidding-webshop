package com.napermial.estuary.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Message {
    public Message(String text, boolean userIsSeller) {
        date = LocalDateTime.now();
        this.text = text;
        this.userIsSeller = userIsSeller;
    }

    public Message() {
        date = LocalDateTime.now();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserIsSeller(boolean userIsSeller) {
        this.userIsSeller = userIsSeller;
    }

    private LocalDateTime date;
    private String text;
    private boolean userIsSeller;
}
