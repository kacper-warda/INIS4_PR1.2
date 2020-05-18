package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    private static final int DEFATULT_FARM_SIZE = 3;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    private Car car;

    public FarmAnimal[] farm;

    //v 1
    private Double salary = 200.0;

    public Human() {
        super("homo sapiens");
        this.weight = 80.0;
        this.farm = new FarmAnimal[DEFATULT_FARM_SIZE];
    }

    public Human(Integer farmSize) {
        super("homo sapiens");
        this.weight = 80.0;
        this.farm = new FarmAnimal[farmSize];
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCar(Car car) {
        if (car.getValue() <= this.salary) {
            System.out.println("Great you can buy it by cash");
            this.car = car;
        } else if (car.getValue() <= this.salary * 12) {
            System.out.println("Not so great, but you can buy it on credit");
            this.car = car;
        } else {
            System.out.println("Sorry, get a rise or find another car");
        }
    }

    public Car getCar() {
        return this.car;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
