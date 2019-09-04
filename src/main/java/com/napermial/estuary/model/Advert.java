package com.napermial.estuary.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class Advert {

    public Advert() {
        id = id++;
        auctionEndDate = LocalDateTime.now();
    }

    public Advert(float bidPrice, String description, String title, List<Message> messages, List<CategoryTag> categoryTags) {
        this.categoryTags = categoryTags;
        id = id++;
        this.bidPrice = bidPrice;
        auctionEndDate = LocalDateTime.now();
        this.description = description;
        this.title = title;
        this.messages = messages;
    }

    private static int id;
    private float bidPrice;
    private LocalDateTime auctionEndDate;
    private String description;
    private String title;
    private List<Message> messages;
    private List<CategoryTag> categoryTags;

    public float getBidPrice() {
        return bidPrice;
    }

    public LocalDateTime getAuctionEndDate() {
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

    public List<CategoryTag> getCategoryTags() {
        return categoryTags;
    }

    public void setCategoryTags(List<CategoryTag> categoryTags) {
        this.categoryTags = categoryTags;
    }
}
