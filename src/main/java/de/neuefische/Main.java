package de.neuefische;

import de.neuefische.model.Car;
import de.neuefische.model.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        // Task 1 - Car
        Car bmw =new Car("BMW",2015,"Sedan","black","3er");
        Car audi =new Car("Audi",2019,"Coupe","silver","A3");

        // Change static properties
        bmw.changeEngine(3.0);
        audi.changeEngine(3.4);

        System.out.println(bmw.describeMe());
        System.out.println(audi.describeMe());
        System.out.println(Car.engine);

        // Task 2 - Student
        Student student1=new Student("Helen",2.3f,"324456");
        System.out.println(student1);

         */

        // Task 3 - StudentDB
        String[] names = new String[]{"Helen","Matt","Tom","Tobi","Max","Lea"};
        String[] ids = new String[]{"123","124","125","126","127","128"};
        StudentDB allStudents=new StudentDB(names,ids);

        // Print all students
        System.out.println("All Students: " + Arrays.toString(allStudents.getAllStudents()));
        System.out.println((allStudents.toString()));

        // Random student
        System.out.println("Random Student: " + (allStudents.randomStudent()));
        System.out.println("Random Student: " +(allStudents.randomStudent()));
        System.out.println("Random Student: " +(allStudents.randomStudent()));

        // Add student
        allStudents.addStudent("Tobias","129");
        System.out.println("All Students after add a student: " +Arrays.toString(allStudents.getAllStudents()));

        // Remove student
        allStudents.removeStudent();
        System.out.println("All Students after remove a student: " + Arrays.toString(allStudents.getAllStudents()));

        allStudents.removeStudent();
        System.out.println("All Students after remove a student: " + Arrays.toString(allStudents.getAllStudents()));
    }
}