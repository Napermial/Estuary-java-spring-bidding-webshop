package com.napermial.estuary.dao.POJOimplementation;

import com.napermial.estuary.dao.AdvertStorage;
import com.napermial.estuary.model.Advert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class AdvertStorageImplementationTest {

    private AdvertStorageImplementation advertStoreage = new AdvertStorageImplementation();

    @Before
    public void setUp() throws Exception {
        Advert advert = new Advert();
        advert.setTitle("Borderlands");
        advert.setDescription("Cool game, bought yesterday have no time pls buy");
        advertStoreage.postAdvert(advert);
        Advert ad2 = new Advert();
        ad2.setTitle("game key");
        ad2.setDescription("buy now get a full chance to win");
        advertStoreage.postAdvert(ad2);
    }

    @After
    public void tearDown() throws Exception {
        advertStoreage = null;
    }

    @Test
    public void addedAdvertIsThird() {
        Advert advert = new Advert();
        advert.setTitle("Counter Strike");
        advert.setDescription("The community became toxiic for me");
        advertStoreage.postAdvert(advert);
        assertEquals("Counter Strike",advertStoreage.listAdverts().get(2).getTitle());
    }
}