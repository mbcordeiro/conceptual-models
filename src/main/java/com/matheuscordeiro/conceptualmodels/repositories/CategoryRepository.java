package com.matheuscordeiro.conceptualmodels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuscordeiro.conceptualmodels.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
