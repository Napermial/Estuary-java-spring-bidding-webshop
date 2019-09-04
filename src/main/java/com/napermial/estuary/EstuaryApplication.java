package com.napermial.estuary;

import com.napermial.estuary.dao.POJOimplementation.UserBaseImplementation;
import com.napermial.estuary.model.Advert;
import com.napermial.estuary.model.CategoryTag;
import com.napermial.estuary.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class EstuaryApplication {

    @Autowired
    User user;

    @Autowired
    UserBaseImplementation users;

    public static void main(String[] args) {
        SpringApplication.run(EstuaryApplication.class, args);
    }

    @PostConstruct
    public void init() {
        user.setEmailAddress("e@f.com");
        user.setPassword("#####");
        users.registerUser(user);
        for (int i = 0; i < 15; i++) {
            Advert advert = new Advert();
            advert.setTitle("aaa");
            advert.setDescription("bbb");
            advert.setCategoryTags(Arrays.asList(CategoryTag.CASUAL, CategoryTag.MULTIPLAYER));
            user.postAnAdvert(advert);
        }

    }
}
