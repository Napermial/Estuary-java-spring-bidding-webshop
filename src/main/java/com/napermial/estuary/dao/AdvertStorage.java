package com.napermial.estuary.dao;

import com.napermial.estuary.model.Advert;
import com.napermial.estuary.model.CategoryTag;

import java.util.List;

public interface AdvertStorage {

    void postAdvert(Advert advert);

    void updateAdvert(int advertId, Advert advert);

    void removeAdvert(int advertIs);

    List<Advert> listAdverts();

    List<Advert> getAdvertsByTag(CategoryTag categoryTag );

}
