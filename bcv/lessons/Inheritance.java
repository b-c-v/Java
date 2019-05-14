package com.bcv.lessons;

public class Inheritance {
    public static void main(String[] args) {
        //восходящее преобразование (от потомка к предку) - те поля и методы потомка, которые отсутствуют в классе предке становятся недоступными.
        B b = new B();
        A a = b; // ==> A a = (A)b;
        a.m(); //Child class B
        ((B) a).m(1); //Child class B1
        b.m(); //Child class B
        a = new A();
        a.m(); //Parent class A

        C c1 = new C();
        Object o = c1;
        ((C) o).m();  //Overwrite method C
        ((C) o).m(5); //Child class B5

        // нисходящем преобразовании типов (от предка к потомку), которое всегда должно выполняться явно, поля и методы снова становятся доступными.
        B b1 = new B();
        A a1 = b1;
        b1 = (B) a1;
        b1.m(); //Child class B
        b1.m(2); //Child class B2

        C c = new C();
        A a2 = c;
        c = (C) a2;
        c.m(); //Overwrite method C
        c.m(3); //Child class B3

        Object o1 = new C();
        ((C) o1).m(); //Overwrite method C
        ((C) o1).m(4); //Child class B4
    }
}

class A {
    void m() {
        System.out.println("Parent class A");
    }
}
class B extends A {
    void m() {
        System.out.println("Child class B");
    }

    void m(int m) {
        System.out.println("Child class B " + m);
    }
}

class C extends B {
void m(){
    System.out.println("Overwrite method C");
}
}

