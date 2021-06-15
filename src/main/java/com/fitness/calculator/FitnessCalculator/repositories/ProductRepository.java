package com.fitness.calculator.FitnessCalculator.repositories;

import com.fitness.calculator.FitnessCalculator.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Sort;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel, String> {

    public List<ProductModel> findAll();

//    public List<ProductModel> findAll(Sort sort);
}
