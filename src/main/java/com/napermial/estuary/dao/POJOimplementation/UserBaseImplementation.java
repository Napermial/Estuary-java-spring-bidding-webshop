package com.napermial.estuary.dao.POJOimplementation;

import com.napermial.estuary.dao.UserBase;
import com.napermial.estuary.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UserBaseImplementation implements UserBase {

    List<User> users = new ArrayList<>();


    @Override
    public User getUser(int userId) throws NoSuchElementException {
        for (User user : users) {
            if (User.getId() == userId) {
                return user;
            }
        }
        throw new NoSuchElementException();

    }

    @Override
    public List<User> listUsers() {
        return users;
    }

    @Override
    public void registerUser(User newUser) {
        users.add(newUser);
    }

    @Override
    public void deleteUser(int userId) throws NoSuchElementException {
        if (users.stream().anyMatch(user -> User.getId() == userId)) {
            users.remove(userId);
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void changeEmailAdress(int userId, String emailAdress) {
        getUser(userId).setEmailAdress(emailAdress);
    }

    @Override
    public void changePassword(int userId, String password) {
        getUser(userId).setPassword(password);
    }
}
