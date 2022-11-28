package de.neuefische.model;

import java.util.Objects;

public class Student {
    private String name;
    private float nc;
    private String matrikelNumber;


    public Student(String name, float nc, String matrikelNumber) {
        this.name = name;
        this.nc = nc;
        this.matrikelNumber = matrikelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNc() {
        return nc;
    }

    public void setNc(float nc) {
        this.nc = nc;
    }

    public String getMatrikelNumber() {
        return matrikelNumber;
    }

    public void setMatrikelNumber(String matrikelNumber) {
        this.matrikelNumber = matrikelNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.nc, nc) == 0 && Objects.equals(name, student.name) && Objects.equals(matrikelNumber, student.matrikelNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nc, matrikelNumber);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nc=" + nc +
                ", matrikelNumber='" + matrikelNumber + '\'' +
                '}';
    }

}
