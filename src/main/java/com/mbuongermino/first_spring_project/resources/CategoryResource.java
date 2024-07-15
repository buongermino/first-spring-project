package com.mbuongermino.first_spring_project.resources;

import com.mbuongermino.first_spring_project.entities.Category;
import com.mbuongermino.first_spring_project.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = ("/categories"))
public class CategoryResource {

    @Autowired
    private CategoryService orderService;

    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        List<Category> categories = orderService.findAll();

        return ResponseEntity.ok().body(categories);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> getById(@PathVariable Long id) {
        Category category = orderService.findById(id);

        return ResponseEntity.ok().body(category);
    }
}
