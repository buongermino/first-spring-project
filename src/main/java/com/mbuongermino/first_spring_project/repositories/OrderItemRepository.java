package com.mbuongermino.first_spring_project.repositories;

import com.mbuongermino.first_spring_project.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
