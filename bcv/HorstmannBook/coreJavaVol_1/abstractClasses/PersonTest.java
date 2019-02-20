package com.bcv.HorstmannBook.coreJavaVol_1.abstractClasses;

/**
 * This program demonstrates abstract classes
 * Listning 5.4
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        //fill the people array with Student and Employee objects

        people[0] = new Employee("Harry Hacker", 10000, 1989, 10, 1);
        people[1] = new Student("Andrew Uchenik", "Java developer");

        //print out names and descriptions of all Person objects

        for (Person p : people) System.out.println(p.getName() + ", " + p.getDescription());
    }


}
