package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Pet("dog");
        dog.name = "Akita";

        dog.feed();

        Animal lion = new Pet("lion");
        lion.name = "leo";

        lion.feed();

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        Car dirtyOne = new Car("Fiat", "Bravo", 2014, 1.8);
        dirtyOne.plates = "GDA1234";
        me.setCar(dirtyOne);

        System.out.println(me.getCar().plates);

        System.out.println("I earn " + me.getSalary() + "UZB");

        Human myWife = new Human();
        myWife.firstName = "Karolina";
        myWife.lastName = "Warda";
        myWife.setSalary(3200.0);

        Car cleanOne = new Car("Fiat", "Bravo", 2014, 1.8);
        myWife.setCar(cleanOne);

        System.out.println(me.getCar());
        System.out.println(myWife.getCar());
        System.out.println(me);

        System.out.println(me.pet);

        System.out.println(me.species);

        System.out.println(new Phone("Nokia", "3310", 1.0, false, 2000) instanceof Object);

//        try {
//            me.pet.beEaten();
//
//            me.pet.sell();
//            me.getCar().sell();
//            me.sell();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        me.setSalary(null);
        System.out.println(me.getSalary());

        FarmAnimal pig = new FarmAnimal("pig");

        try {
            pig.beEaten();
            me.pet.beEaten();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}










