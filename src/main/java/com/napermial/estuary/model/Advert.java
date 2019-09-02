package com.napermial.estuary.model;

import org.springframework.stereotype.Component;

<<<<<<< Updated upstream
import java.util.Date;
=======
import java.time.LocalDateTime;
>>>>>>> Stashed changes
import java.util.List;

@Component
public class Advert {

    public Advert() {
    }

    public Advert(float bidPrice, Date auctionEndDate, String description, String title, List<Message> messages) {
        id = id++;
        this.bidPrice = bidPrice;
        this.auctionEndDate = auctionEndDate;
        this.description = description;
        this.title = title;
        this.messages = messages;
    }

    private static int id;
    private float bidPrice;
    private Date auctionEndDate;
    private String description;
    private String title;
    private List<Message> messages;

    public float getBidPrice() {
        return bidPrice;
    }

    public Date getAuctionEndDate() {
        return auctionEndDate;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public List<Message> getMessages() {
        return messages;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void update(Advert advert) {
        this.setTitle(advert.getTitle());
        this.setDescription(advert.getDescription());
    }
}
