package com.bcv.basics;

//super keyword is a reference variable that is used to refer parent class objects
//super with variables
//super with methods
//super with constructors


public class SuperKeyword {

    int superValue = 120;

    SuperKeyword() {
        System.out.println("SuperKeyword constructor");
    }

    void message() {
        System.out.println("This is SuperKeyword class");
    }
}

/* sub class Keyword */
class Keyword extends SuperKeyword {
    int superValue = 180;

    Keyword() {
        //super with constructors
        // invoke or call parent class constructor
        super();
        System.out.println("Keyword constructor");
    }

    void display() {
        //super with variables.
        //Print superValue of base class (SuperKeyword)
        System.out.println("SuperKeyword value: " + super.superValue); //SuperKeyword value: 120

        /* print superValue of Keyword class*/
        System.out.println("Keyword value: " + superValue); //Keyword value: 180

    }

    void message() {
        System.out.println("This is Keyword class");
    }

    void displayKeyword() {
        // will invoke or call current class message() method
        message();

        //super with methods
        //Will invoke or call parent class message() method
        super.message();
    }
}


class TestSuper {
    public static void main(String[] args) {
        Keyword s = new Keyword();
        s.display();
        s.displayKeyword();
    }
}