package de.neuefische.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Car {
    public static double engine =2.4;
    private String brand;
    private int year;
    private String type;
    private String color;
    private String model;

    public String describeMe(){
        return this.brand +" "+ this.model;

    }

    public double changeEngine(double num){
        engine =num;
        return engine;

    }
}
