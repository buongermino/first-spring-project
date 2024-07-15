package com.mbuongermino.first_spring_project.repositories;

import com.mbuongermino.first_spring_project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}