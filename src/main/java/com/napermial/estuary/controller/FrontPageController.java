package com.napermial.estuary.controller;

import com.napermial.estuary.dao.POJOimplementation.AdvertStorageImplementation;
import com.napermial.estuary.model.Advert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FrontPageController {

    @Autowired
    AdvertStorageImplementation advertStorageImplementation;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String frontPageController() {
        return "index";
    }

    @ModelAttribute("adverts")
    List<Advert> adverts(){
        return advertStorageImplementation.listAdverts();
    }

}
