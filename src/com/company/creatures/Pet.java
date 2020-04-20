package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species) {
        super(species);
    }

    @Override
    public void beEaten() throws Exception {
        throw new Exception("you can not eat dogs and cats in europe!");
    }
}
