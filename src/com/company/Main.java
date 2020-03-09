package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";

        dog.feed();

        Animal lion = new Animal("lion");
        lion.name = "leo";

        lion.feed();

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        me.pet.feed();
    }
}
