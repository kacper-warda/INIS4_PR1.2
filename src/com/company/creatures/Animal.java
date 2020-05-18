package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Edible, Saleable, Feedable, Comparable<Animal> {
    final public String species;
    public String name;
    protected Double weight;
    File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;
    private final static Double DEFAULT_FOOD_WEIGHT = 1.5;


    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
        }
    }


    @Override
    public int compareTo(Animal otherAnimal) {
        return (int) (this.weight - otherAnimal.weight);
    }

    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double feedWeight) {
        if (weight <= 0) {
            System.out.println("too late, sorry");
        } else {
            weight += feedWeight;
            System.out.println("thx for food my weight is now " + this.weight);
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("that a dead animal you freak");
        } else if (weight <= 3) {
            System.out.println("thx I'm hungry");
        } else {
            System.out.println("thx for a walk");
        }
    }

    public String toString() {
        return "Animal: " + this.species + " " + this.name;
    }

    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human) {
            throw new Exception("no way bastard are you cannibal or something?11!!1!!!!!!");
        }
        System.out.println(this.toString() + " adiooooooos");
        weight = 0.0;
    }

    @Override
    public void sell() throws Exception {
        if (this instanceof Human) {
            throw new Exception("slavery is banned now, sorry");
        }
        System.out.println(" now you sold an animal " + this);
    }
}
