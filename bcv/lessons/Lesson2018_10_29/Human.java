package com.bcv.lessons.Lesson2018_10_29;

public class Human {
    public enum Sex {
        MALE,
        FEMALE;
    }

    private int age;
    private double weight;
    private int height;
    private Sex sex;

    private double bicepsVolume;
    private double chestVolume;
    private double waistVolume;
    private double hipVolume;

    public Human() {

    }

    public Human(int age, double weight, int height, Sex sex) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    public Human(int age, double weight, int height, Sex sex, double bicepsVolume, double chestVolume, double waistVolume, double hipVolume) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.bicepsVolume = bicepsVolume;
        this.chestVolume = chestVolume;
        this.waistVolume = waistVolume;
        this.hipVolume = hipVolume;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public Sex getSex() {
        return sex;
    }

    public double getBicepsVolume() {
        return bicepsVolume;
    }

    public double getChestVolume() {
        return chestVolume;
    }

    public double getWaistVolume() {
        return waistVolume;
    }

    public double getHipVolume() {
        return hipVolume;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setBicepsVolume(double bicepsVolume) {
        this.bicepsVolume = bicepsVolume;
    }

    public void setChestVolume(double chestVolume) {
        this.chestVolume = chestVolume;
    }

    public void setWaistVolume(double waistVolume) {
        this.waistVolume = waistVolume;
    }

    public void setHipVolume(double hipVolume) {
        this.hipVolume = hipVolume;
    }
}
