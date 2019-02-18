package com.bcv.lessons.HorstmannBook.coreJavaVol_1;

/**
 * This program demonstrates static methods.
 * Listing 4.3
 */

public class StaticTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Andrew", 5000);
        staff[1] = new Employee("Sergey", 800);
        staff[2] = new Employee("Dima", 1900);
        for (Employee e : staff) {
            System.out.println("name: " + e.getName() + ", id: " + e.getId() + ", salary: " + e.getSalary());
        }
    }
}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = nextId;
        nextId++;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Grisha", 942);
        System.out.println(e.getName() + " " + e.getSalary());
    }


}
