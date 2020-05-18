package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Human me = new Human(3);
        me.firstName = "Kacper";
        me.lastName = "Warda";


        Human myWife = new Human(3);
        myWife.firstName = "Karolina";
        myWife.lastName = "Warda";
        myWife.setSalary(3200.0);

        Car fiat = new Car("Fiat", "Tipo", 2020, 1.8);
        Car alfa = new Car("AlfaRomeo", "Julia", 2019, 2.4);
        Car ferrari = new Car("Ferrari", "FF", 2018, 4.0);

        me.setCar(fiat, 0);
        me.setCar(ferrari, 1);
        me.setCar(alfa, 2);

        System.out.println(Arrays.toString(me.getGarage()));

        me.sortCarsByYear();

        System.out.println(Arrays.toString(me.getGarage()));

        try {
            alfa.sell(me, myWife, 2.0);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(me.cash);
        System.out.println(Arrays.toString(myWife.getGarage()));
        System.out.println(myWife.cash);


    }
}










