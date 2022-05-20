package org.example;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@ToString
public class Horse implements Animal{

    @Value("${horse.breed}")
    private String breed;
    @Value("${horse.color}")
    private String color;
    @Value("${horse.age}")
    private int age;

    public Horse(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Horse() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("akylduu,yldam,suluu");
    }

    @Override
    public void animalMinus() {
        System.out.println("jalkoo");
    }
}
