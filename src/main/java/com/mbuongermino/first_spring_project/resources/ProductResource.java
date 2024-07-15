package com.mbuongermino.first_spring_project.resources;

import com.mbuongermino.first_spring_project.entities.Product;
import com.mbuongermino.first_spring_project.services.ProductService;
import com.mbuongermino.first_spring_project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = ("/products"))
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        List<Product> products = productService.findAll();

        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        Product product = productService.findById(id);

        return ResponseEntity.ok().body(product);
    }
}
