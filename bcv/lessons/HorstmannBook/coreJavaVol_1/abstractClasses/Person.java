package com.bcv.lessons.HorstmannBook.coreJavaVol_1.abstractClasses;

public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
