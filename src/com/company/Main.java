package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
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
        me.phone = new Phone("Noka", "3310", 1.0, false, 1999);

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


        String[] apps = {"facebook", "messenger"};

        me.phone.installAnApp("facebook");
        me.phone.installAnApp("facebook", "2.4.21");
        me.phone.installAnApp(apps);
        me.phone.installAnApp(new URL("https", "https://myserver/facebook/2.5.2", 443, "facebook"));

        Animal parrot = new Pet("parrot");
        Animal cow = new FarmAnimal("cow");
        Animal myBrother = new Human();

        System.out.println(parrot.toString());
        System.out.println(cow.toString());
        System.out.println(myBrother.toString());

        me.feed();
        me.feed();

        me.pet.feed();
        me.pet.feed();
        me.pet.feed(0.2);

    }
}










