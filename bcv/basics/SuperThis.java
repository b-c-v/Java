package com.bcv.basics;


public class SuperThis {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    SuperThis() {
        this(0); //call constructor with parameters
        System.out.println("Constructor#");
    }

    SuperThis(int x) {
        super(); //call the constructor parent class (here Object)
//        this(); //C.E. call to this must be first statement in constructor body
        System.out.println("Constructor#int");
    }

    //inner class. If use keyword "static" class have name - nested
    class Z {
        void m() {
            System.out.println(this);
            System.out.println(SuperThis.this);
        }
    }

    public static void main(String[] args) {
        //доступ к методу m() вложенного класса Z
        SuperThis t = new SuperThis();
        Z z = t.new Z();
        z.m();

        //доступ к методу m() класса R
        new R().m();
    }

}

class T {
    void m() {
        System.out.println("T#m");
    }
}

class R extends T {
    void m() {
        super.m();
    }

}