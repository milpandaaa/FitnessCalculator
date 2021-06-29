package com.fitness.calculator.fitnesscalculator.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Класс, описывающий модель базы данных
 */
@Entity
public class Product {
    @Id
    private String title;
    private Integer proteins;
    private Integer fats;
    private Integer carbohydrates;
    private Integer calorie;

    public Product(String title, Integer proteins, Integer fats, Integer carbohydrates, Integer calorie) {
        this.title = title;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calorie = calorie;
    }

    public Product() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getProteins() {
        return proteins;
    }

    public void setProteins(Integer proteins) {
        this.proteins = proteins;
    }

    public Integer getFats() {
        return fats;
    }

    public void setFats(Integer fats) {
        this.fats = fats;
    }

    public Integer getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Integer carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Integer getCalorie() {
        return calorie;
    }

    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return Objects.equals(title, that.title) && Objects.equals(proteins, that.proteins) && Objects.equals(fats, that.fats) && Objects.equals(carbohydrates, that.carbohydrates) && Objects.equals(calorie, that.calorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, proteins, fats, carbohydrates, calorie);
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calorie=" + calorie +
                '}';
    }
}
