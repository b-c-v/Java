package com.bcv.basics;

public class LoadingClasses {
    public static void main(String[] args) {
        new Parent();
        /*if call with Parent & Child (difference is that compile don't go to static block second time
        Parent static init
        Parent init
        Parent#constr
        ~~~
        Child static init
        Parent init
        Parent#constr
        Child init
        Child#constr*/

        System.out.println("~~~");
        new Child();
        /* if call without new Parent
        Parent static init
        Child static init
        Parent init
        Parent#constr
        Child init
        Child#constr*/
    }

}

class Parent {
    static {
        System.out.println("Parent static init");
    }

    {
        System.out.println("Parent init");
    }

    Parent() {
        System.out.println("Parent#constr");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static init");
    }

    {
        System.out.println("Child init");
    }

    Child() {
        System.out.println("Child#constr");
    }
}

