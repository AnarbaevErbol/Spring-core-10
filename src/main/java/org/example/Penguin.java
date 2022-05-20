package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@ToString
public class Penguin implements Animal{

    @Value("${penguin.breed}")
    private String breed;
    @Value("${penguin.color}")
    private String color;
    @Value("${penguin.age}")
    private int age;

    public Penguin(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    public Penguin(){

    }

    @Override
    public void animalPlus() {
        System.out.println("suluu");
    }

    @Override
    public void animalMinus() {
        System.out.println("jylmakay");
    }
}
