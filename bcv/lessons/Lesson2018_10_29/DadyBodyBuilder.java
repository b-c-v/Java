package com.bcv.lessons.Lesson2018_10_29;

public class DadyBodyBuilder extends Bodybuilder {

    @Override
    void continentalPress() {
        System.out.println("DadyBodyBuilder Made continentalPress");
    }

    @Override
    void upBarbell() {
        System.out.println("DadyBodyBuilder Made upBarbell");
    }

    @Override
    void backExtension() {
        System.out.println("DadyBodyBuilder Made backExtension");
    }

    @Override
    public void training() {
        backExtension();
        continentalPress();
        swallow();
        upBarbell();
    }

    @Override
    void makeHorizon() {
        System.out.println("DadyBodyBuilder Made Horizon");
    }


    @Override
    void swallow() {
        this.setAge(14);
        this.setHeight(140);
        this.setWeight(178);
        this.setSex(Sex.FEMALE);


    }

    @Override
    public String makeDiet() {
        return "I want eat all around me";
    }
}
