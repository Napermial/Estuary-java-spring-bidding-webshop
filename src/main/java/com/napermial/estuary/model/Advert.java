package com.napermial.estuary.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Advert {
    public Advert() {
        this.id = count.incrementAndGet();
        bidPrice = 0f;
        auctionEndDate = LocalDateTime.now();
    }


    public Advert(String description, String title, List<CategoryTag> categoryTags) {
        this.categoryTags = categoryTags;
        this.id = count.incrementAndGet();
        bidPrice = 0f;
        auctionEndDate = LocalDateTime.now();
        this.description = description;
        this.title = title;
    }

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;

    private float bidPrice;
    private LocalDateTime auctionEndDate;
    private String description;
    private String title;
    private List<Message> messages;
    private List<CategoryTag> categoryTags;
    private User poster;

    public void setPoster(User poster) {
        this.poster = poster;
    }

    public User getPoster() {
        return poster;
    }

    public int getId() {
        return id;
    }

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
