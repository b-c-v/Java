package com.bcv.lessons.entitySample;

public class InHuman {
    private String name;
    private double weight;
    private double g;
    private double mass;

    public InHuman() {
    }

    public InHuman(double weight, double g) {
        this.weight = weight;
        this.g = g;
        if (g != 0) {
            this.mass = weight/g;

        }else {
            this.mass = weight;
        }
    }

    public double getWeight() {
        return weight;
    }

    public double getG() {
        return g;
    }

    public double getMass() {
        return mass;
    }
}

class Portal {

}
class UsePortal{
    public static void main(String[] args) {

    }
}

