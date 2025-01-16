package com.workshop.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
