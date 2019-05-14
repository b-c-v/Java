package com.bcv.basics;

//this is a reference variable that refers to the current object.
//1. to refer current class instance variables
//2. to invoke current class constructor
//3. to return the current class instance
//4. as method parameter
//5. to invoke current class method
//6. as an argument in the constructor call

public class ThisKeyword {
    int a;
    int b;

    ThisKeyword() {
        //2. this() to invoke current class constructor
        this(20, 30);
    }

    ThisKeyword(int a, int b) {
        //1. to refer current class instance variables
        this.a = a;
        this.b = b;
    }


    void display() {
        System.out.println("a = " + a + " b = " + b);

        //5. to invoke current class method
        this.getMethodParameter();
    }

    //4. as method parameter
    void displayMethodParameter(ThisKeyword obj) {
        System.out.println("a = " + a + " b = " + b);
    }

    void getMethodParameter() {
        displayMethodParameter(this);

    }

    //3. to return the current class instance
    ThisKeyword getThisKeyword() {
        return this;
    }

    public int getA() {
        return a;
    }
}

class TestThis {
    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword(10, 20);
        t.getThisKeyword().display(); //!цеопчка работает только так, если сделать get другого типа (int, double...) цепочка не работает
        ThisKeyword invokeCurrent = new ThisKeyword();
        invokeCurrent.display();
    }
}

//6. as an argument in the constructor call
class A {
    B obj;

    // Parameterized constructor with object of B as a parameter
    A(B obj) {
        this.obj = obj;

        // calling display method of class B
        obj.display();
    }

}

class B {
    int x = 5;

    // Default Contructor that create a object of A  with passing this as an argument in the constructor
    B() {
        A obj = new A(this);
    }

    // method to show value of x
    void display() {
        System.out.println("Value of x in Class B : " + x);
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}
