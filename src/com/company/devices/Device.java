package com.company.devices;

public class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    private Double value = 2000.0;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    public Double getValue() {
        return this.value;
    }

    public String toString() {
        return this.producer + " " + this.model;
    }
}
