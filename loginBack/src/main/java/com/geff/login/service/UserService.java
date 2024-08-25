package com.geff.login.service;


import com.geff.login.model.User;
import com.geff.login.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IuserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> getUsers() {
        return
                userRepository.findAll();
    }

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Override
    public void saveUser(User user) {
        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        userRepository.save(user);
    }



    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
