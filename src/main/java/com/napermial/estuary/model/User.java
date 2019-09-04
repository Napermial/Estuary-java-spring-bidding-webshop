package com.napermial.estuary.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class User {
    private static int id;
    private String emailAdress;
    private String password;
    private List<Advert> adverts;
    private List<Message> messages;
    private LocalDateTime regeistrationDate;

    public void setEmailAdress(String emailaddress) {
        this.emailAdress = emailaddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdverts(List<Advert> adverts) {
        this.adverts = adverts;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public static int getId() {
        return id;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public List<Advert> getAdverts() {
        return adverts;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public LocalDateTime getRegeistrationDate() {
        return regeistrationDate;
    }

    public User(String emailAdress, String password, List<Advert> adverts, List<Message> messages) {
        this.emailAdress = emailAdress;
        this.password = password;
        this.adverts = adverts;
        this.messages = messages;
        id = id++;
        regeistrationDate = LocalDateTime.now();
    }

    public User() {
    }

    public void postAnAdvert(Advert advert) {
        adverts.add(advert);
    }

    public void removeAdvert(int id) {
        adverts.remove(id);
    }

    public void updateAdvert(int id, Advert advert) {
        Advert ad = adverts.get(id);
        ad.update(advert);
    }

    public void sendMessage(Message message) {
        messages.add(message);
    }

}
