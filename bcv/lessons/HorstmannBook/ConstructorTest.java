package com.bcv.lessons.HorstmannBook;

import java.util.Random;

/**
 * This program demonstrates object construction.
 * Listing 4.5
 */

public class ConstructorTest {
    public static void main(String[] args) {
        // fill the staff array with three EmployeeConstructorTest objects
        EmployeeConstructorTest[] staff = new EmployeeConstructorTest[3];

        staff[0] = new EmployeeConstructorTest("Harry", 40000);
        staff[1] = new EmployeeConstructorTest(60000);
        staff[2] = new EmployeeConstructorTest();

        // print out information about all EmployeeConstructorTest objects
        for (EmployeeConstructorTest e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
    }
}

class EmployeeConstructorTest {
    // three overloaded constructors
    public EmployeeConstructorTest(String n, double s) {
        name = n;
        salary = s;
    }

    public EmployeeConstructorTest(double s) {
        // calls the EmployeeConstructorTest(String, double) constructor
        this("EmployeeConstructorTest #" + nextId, s);
    }

    // the default constructor
    public EmployeeConstructorTest() {
        // name initialized to ""--see below
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    private static int nextId;

    private int id;

    private String name = ""; // instance field initialization

    private double salary;

    // static initialization block
    static {
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }
}