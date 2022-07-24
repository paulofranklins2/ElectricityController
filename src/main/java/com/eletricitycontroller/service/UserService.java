package com.eletricitycontroller.service;

import com.eletricitycontroller.model.User;

import java.util.Collection;

public interface UserService {
    User newUser(User user);

    Collection<User> userList(int limit);

    User getUser(String id);

    User updateUser(User user);

    Boolean deleteUser(String id);
}
