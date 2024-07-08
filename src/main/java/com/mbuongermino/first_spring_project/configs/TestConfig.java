package com.mbuongermino.first_spring_project.configs;

import com.mbuongermino.first_spring_project.entities.User;
import com.mbuongermino.first_spring_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "John Doe", "johndoe@user.com", "9193939393", "123345");
        User user2 = new User(null, "Jane Doe", "janedoe@user.com", "9193939393", "123345");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
