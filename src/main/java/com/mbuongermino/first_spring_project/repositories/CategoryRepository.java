package com.mbuongermino.first_spring_project.repositories;

import com.mbuongermino.first_spring_project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
