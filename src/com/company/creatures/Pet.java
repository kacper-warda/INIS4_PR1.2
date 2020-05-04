package com.company.creatures;

public class Pet extends Animal {
    private static final double DEFAULT_FOOD_WEIGHT = 0.5;

    public Pet(String species) {
        super(species);
    }

    @Override
    public void beEaten() throws Exception {
        throw new Exception("you can not eat dogs and cats in europe!");
    }

    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }

}
