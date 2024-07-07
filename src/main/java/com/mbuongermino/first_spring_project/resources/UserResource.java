package com.mbuongermino.first_spring_project.resources;

import com.mbuongermino.first_spring_project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ("/users"))
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getAll() {
        User user = new User(1L, "Marcelo", "marcelo@user.com", "55599049", "123456");
        return ResponseEntity.ok(user);
    }
}
