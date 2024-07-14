package com.mbuongermino.first_spring_project.configs;

import com.mbuongermino.first_spring_project.entities.Order;
import com.mbuongermino.first_spring_project.entities.User;
import com.mbuongermino.first_spring_project.repositories.OrderRepository;
import com.mbuongermino.first_spring_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "John Doe", "johndoe@user.com", "9193939393", "123345");
        User user2 = new User(null, "Jane Doe", "janedoe@user.com", "9193939393", "123345");

        Order order1 = new Order(null, Instant.parse("2020-04-04T19:52:07Z"), user1);
        Order order2 = new Order(null, Instant.parse("2023-06-06T19:52:07Z"), user2);
        Order order3 = new Order(null, Instant.parse("2024-05-07T19:52:07Z"), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
