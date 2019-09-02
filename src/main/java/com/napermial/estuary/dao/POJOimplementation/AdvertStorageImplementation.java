package com.napermial.estuary.dao.POJOimplementation;

import com.napermial.estuary.dao.AdvertStorage;
import com.napermial.estuary.model.Advert;
import com.napermial.estuary.model.CategoryTag;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdvertStorageImplementation implements AdvertStorage {

    List<Advert> adverts = new ArrayList<>();

    @Override
    public void postAdvert(Advert advert) {
        adverts.add(advert);
    }

    @Override
    public void updateAdvert(int advertId, Advert advert) {
        adverts.get(advertId).setTitle(advert.getTitle());
        adverts.get(advertId).setDescription(advert.getDescription());
    }

    @Override
    public void removeAdvert(int advertIs) {
        adverts.remove(advertIs);
    }

    @Override
    public List<Advert> listAdverts() {
        return adverts;
    }

    @Override
    public List<Advert> getAdvertsByTag(CategoryTag categoryTag) {
        List<Advert> advertList = new ArrayList<>();
        for (Advert advert : adverts) {
            if (advert.getCategoryTags().contains(categoryTag)) {
                adverts.add(advert);
            }
        }
        return advertList;
    }
}
