package com.eletricitycontroller.service.implementation.user;

import com.eletricitycontroller.model.User;
import com.eletricitycontroller.repository.UserRepository;
import com.eletricitycontroller.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
@Slf4j
public class UserImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User newUser(User user) {
        log.info("Saving new user: {}", user.getName());
        return userRepository.save(user);
    }

    @Override
    public Collection<User> userList(int limit) {
        log.info("Fetching user List: {}");
        return userRepository.findAll(PageRequest.of(0, limit)).toList();
    }

    @Override
    public User getUser(String id) {
        log.info("Fetching user id: {}", id);
        return userRepository.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        log.info("Updating user: {}", user.getName());
        return userRepository.save(user);
    }

    @Override
    public Boolean deleteUser(String id) {
        log.info("Deleting user id: {}", id);
        userRepository.deleteById(id);
        return Boolean.TRUE;
    }
}
