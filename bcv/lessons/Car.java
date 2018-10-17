//2018_10_08

package com.bcv.lessons;

public class Car {
    private String mark;
    private String model;
    private String color;
    private double engineVolume;
    public Car(){}
    public Car (String mark, String model, String color, double engineVolume){
        //this ключевое слово указывает, что работаем с данным объектом
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
    }
    public String getMark(){
        return mark;
    }

    public String getModel() {
        return model;
    }
    public String getColor(){
        return color;
    }
    public double getEngineVolume(){
        return engineVolume;
    }



}
