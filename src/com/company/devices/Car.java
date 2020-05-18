package com.company.devices;

import com.company.creatures.Human;

public class Car extends Device implements Comparable<Car> {

    public final Double engineVolume;

    public String plates;


    public Car(String producer, String model, Integer yearOfProduction, Double engineVolumne) {
        super(producer, model, yearOfProduction);
        this.engineVolume = engineVolumne;
    }

    @Override
    void turnOn() {
        System.out.println("yeah now you can drive around");
    }

    public String toString() {
        return super.toString() + " " + this.plates;
    }

    @Override
    public int compareTo(Car o) {
        return o.yearOfProduction - this.yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("nie mam auta");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("nie ma miejsca");
        }
        if (buyer.cash < price) {
            throw new Exception("nie ma pieniedzy");
        }

        seller.cash += price;
        buyer.cash -= price;
        seller.removeCar(this);
        buyer.addCar(this);
        System.out.println("transkacja się udała");
    }
}
