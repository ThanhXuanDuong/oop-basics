package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Car bmw =new Car();
        bmw.brand="BMW";
        bmw.year=2015;
        bmw.type="Sedan";
        bmw.color="black";
        bmw.model="3er";

        Car audi =new Car();
        audi.brand="Audi";
        audi.year=2019;
        audi.type="Coupe";
        audi.color="silver";
        audi.model="A3";

        // Change static properties
        bmw.changeEngine(3.0);
        audi.changeEngine(3.4);

        System.out.println(bmw.describeMe());
        System.out.println(audi.describeMe());
        System.out.println(Car.engine);
    }
}