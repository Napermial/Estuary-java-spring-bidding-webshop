package com.napermial.estuary.model;

import com.napermial.estuary.dao.POJOimplementation.AdvertStorageImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class User {
    private static int id;
    private String emailAddress;
    private String password;

    @Autowired
    private AdvertStorageImplementation adverts;

    private List<Message> messages;
    private LocalDateTime regeistrationDate;

    public void setEmailAddress(String emailaddress) {
        this.emailAddress = emailaddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public static int getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public List<Advert> getAdverts() {
        return adverts.listAdverts();
    }

    public List<Message> getMessages() {
        return messages;
    }

    public LocalDateTime getRegeistrationDate() {
        return regeistrationDate;
    }

    public User(String emailAddress, String password, List<Message> messages) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.messages = messages;
        id = id++;
        regeistrationDate = LocalDateTime.now();
    }

    public User() {
    }

    public void postAnAdvert(Advert advert) {
        advert.setPoster(this);
        adverts.postAdvert(advert);
    }

    public void removeAdvert(int id) {
        adverts.removeAdvert(id);
    }

    public void updateAdvert(int id, Advert advert) {
        adverts.updateAdvert(id, advert);
    }

    public void sendMessage(Message message) {
        messages.add(message);
    }

}
