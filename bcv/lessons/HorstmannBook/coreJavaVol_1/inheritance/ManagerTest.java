package com.bcv.lessons.HorstmannBook.coreJavaVol_1.inheritance;

/**
 * This program demonstrates inheritance
 * Listin 5.1
 */
public class ManagerTest {

    public static void main(String[] args) {

        // construct a Manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee sergeyTest = new Employee("Sergey Test", 20000, 1986, 8, 19);
        System.out.println(sergeyTest.getHireDay() + " " + sergeyTest.getSalary() + " " + sergeyTest.getName());
        sergeyTest.raiseSalary(20);
        System.out.println(sergeyTest.getSalary());

        Employee[] staff = new Employee[4];

        // fill the staff array with Manager and Employee objects

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        staff[3] = sergeyTest;

        sergeyTest.raiseSalary(10);
        sergeyTest.setSalary(10);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }

}
