package com.napermial.estuary.dao;

import com.napermial.estuary.model.User;

import java.util.List;

public interface UserBase {

    User getUser(int userId);

    List<User> listUsers();

    void registerUser(User newUser);

    void deleteUser(int userId);

    void changeEmailaddress(int userId, String emailAdress);

    void changePassword(int userId, String password);
}
