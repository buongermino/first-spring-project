package com.mbuongermino.first_spring_project.services;

import com.mbuongermino.first_spring_project.entities.Product;
import com.mbuongermino.first_spring_project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
         Optional<Product> product = productRepository.findById(id);
         return product.get();
    }
}
