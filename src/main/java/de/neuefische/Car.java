package de.neuefische;

public class Car {
    static double engine =2.4;
    String brand;
    int year;
    String type;
    String color;
    String model;

    String describeMe(){
        return this.brand +" "+ this.model;
    }

    void changeEngine(double newEngine){
        Car.engine=newEngine;
    }
}
