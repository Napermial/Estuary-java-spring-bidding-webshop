package com.napermial.estuary.model;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class User {
    private String emailAdress;
    private String password;
    private List<Advert> adverts;
    private List<Message> messages;
    private Date regeistrationDate;

    public void postAnAdvert(Advert advert){
        adverts.add(advert);
    }

    public void removeAdvert(int id){
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
