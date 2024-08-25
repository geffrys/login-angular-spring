package com.geff.login.service;

import com.geff.login.model.User;

import java.util.List;

public interface IuserService {
    User getUser(Long id);
    List<User> getUsers();
    void saveUser(User user);
    void deleteUser(Long id);
}
