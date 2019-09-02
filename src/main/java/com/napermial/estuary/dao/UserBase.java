package com.napermial.estuary.dao;

import com.napermial.estuary.model.User;

public interface UserBase {
    User getUser();

    void registerUser(User newUser);

    void deleteUser(int userId);

    void changeUserName(String name);
}
