package org.example;

import lombok.ToString;

@ToString
public class Person {

    private String name;
    private int age;
    private Animal animal;

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }
    public Person(Horse horse){

    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void animal(){
        animal.animalMinus();
        animal.animalPlus();
    }
}
