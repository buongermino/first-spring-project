package com.mbuongermino.first_spring_project.services;

import com.mbuongermino.first_spring_project.entities.User;
import com.mbuongermino.first_spring_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
         Optional<User> user = userRepository.findById(id);
         return user.get();
    }
}
