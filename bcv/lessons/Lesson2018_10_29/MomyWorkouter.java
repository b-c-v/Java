package com.bcv.lessons.Lesson2018_10_29;

public class MomyWorkouter extends Workouter {
    @Override
    void flag() {
        System.out.println("Made flag");

    }

    @Override
    void towel() {
        System.out.println("Made towel");

    }



    @Override
    void makeHorizon() {
        System.out.println("Made horizon");

    }

    @Override
    void swallow() {
        this.setAge(17);
        this.setHeight(178);
        this.setWeight(50);
        this.setSex(Sex.MALE);
    }

    @Override
    public String makeDiet() {
        return "go to grandma and eat cake";

    }
    public void run (int distance){
        super.run(distance);
        System.out.println("Da ny nafig");
    }
    public void training(){
        makePhisicalExercise();
        flag();
        towel();
        makeHorizon();
        swallow();
        makeDiet();
    }
}
