package com.bcv.HorstmannBook.Chapter2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * This program count how many days do you live
 *
 * @author bcv
 * @version 1.0
 * @since 2018-10-15
 */

public class DaysAlive {

    public static void main(String[] args) {
        /**
         * Reading input data of user's birthday.
         *
         * @param year The year of user's birthday.
         * @param month The month of user's birthday
         * @param day The day of user's birthday
         * @return nothing
         */

        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter year of your birthday: ");
        int year = aScanner.nextInt();
        System.out.print("Enter month of your birthday: ");
        int month = aScanner.nextInt();
        System.out.print("Enter day of your birthday: ");
        int day = aScanner.nextInt();
        /**
         * Add dates of birthday using LocalDate class
         * @see LocalDate#of(int, int, int)
         */

        LocalDate myBirthday = LocalDate.of(year, month, day);
        /**
         * Add today date
         * @see LocalDate
         */
        LocalDate today = LocalDate.now();
        /**
         * Count how many days between two dates
         * @see ChronoUnit#DAYS
         * @return value of days
         */
        long DaysAlive = ChronoUnit.DAYS.between(myBirthday, today);
        /**
         *@param If user live only one day the message will with word "day"
         *@param If user live more than one day, the message will with word "days"
         */
        if (DaysAlive == 1) {
            System.out.println("You live " + DaysAlive + " day!");
        } else {
            System.out.println("You live " + DaysAlive + " days!");
        }

    }
}
