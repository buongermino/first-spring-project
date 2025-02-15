package com.mbuongermino.first_spring_project.services;

import com.mbuongermino.first_spring_project.entities.Order;
import com.mbuongermino.first_spring_project.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(long id) {
         Optional<Order> order = orderRepository.findById(id);
         return order.get();
    }
}
