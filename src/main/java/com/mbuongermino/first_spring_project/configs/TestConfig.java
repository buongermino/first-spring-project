package com.mbuongermino.first_spring_project.configs;

import com.mbuongermino.first_spring_project.entities.*;
import com.mbuongermino.first_spring_project.enums.OrderStatus;
import com.mbuongermino.first_spring_project.repositories.*;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category("Electronics");
        Category cat2 = new Category("Books");
        Category cat3 = new Category("Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat3, cat2));

        Product p1 = new Product("The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product("Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product("Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product("PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product("Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User user1 = new User(null, "John Doe", "johndoe@user.com", "9193939393", "123345");
        User user2 = new User(null, "Jane Doe", "janedoe@user.com", "9193939393", "123345");

        Order order1 = new Order(null, Instant.parse("2020-04-04T19:52:07Z"), OrderStatus.WAITING_PAYMENT.getCode(), user1);
        Order order2 = new Order(null, Instant.parse("2023-06-06T19:52:07Z"), OrderStatus.PAID.getCode(), user2);
        Order order3 = new Order(null, Instant.parse("2024-05-07T19:52:07Z"), OrderStatus.DELIVERED.getCode(), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

        OrderItem oi1 = new OrderItem( p1, order1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem( p3, order1, 2, p3.getPrice());
        OrderItem oi3 = new OrderItem( p3, order2, 2, p3.getPrice());
        OrderItem oi4 = new OrderItem( p5, order3, 2, p5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
    }
}
