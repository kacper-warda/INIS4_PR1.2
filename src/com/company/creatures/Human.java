package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;

public class Human extends Animal {
    private static final int DEFATULT_FARM_SIZE = 3;
    public Double cash = 10000.0;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    private Car[] garage;

    public FarmAnimal[] farm;

    //v 1
    private Double salary = 200.0;

    public Human() {
        super("homo sapiens");
        this.weight = 80.0;
        this.farm = new FarmAnimal[DEFATULT_FARM_SIZE];
    }

    public Human(Integer garageSize) {
        super("homo sapiens");
        this.weight = 80.0;
        this.garage = new Car[garageSize];
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCar(Car car, Integer index) {
        if (car.getValue() <= this.salary) {
            System.out.println("Great you can buy it by cash");
            this.garage[index] = car;
        } else if (car.getValue() <= this.salary * 12) {
            System.out.println("Not so great, but you can buy it on credit");
            this.garage[index] = car;
        } else {
            System.out.println("Sorry, get a rise or find another car");
        }
    }

    public Car getCar(Integer index) {
        return this.garage[index];
    }

    public Double sumCarsValue() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.getValue();
            }
        }
        return sum;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public void sortCarsByYear() {
        Arrays.sort(garage);
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car newCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == newCar) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) throws Exception {
        if (!this.hasFreeSpace()) {
            throw new Exception("nie ma miejsca");
        }
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
                break;
            }
        }
    }
}
