package com.fitness.calculator.fitnesscalculator.repository;

import com.fitness.calculator.fitnesscalculator.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * Класс-репозиторий для работы с базой данных.
 * Тут создаются необходимые запросы.
 */

public interface ProductRepository extends JpaRepository<Product, String> {
    public List<Product> findAll();
}
