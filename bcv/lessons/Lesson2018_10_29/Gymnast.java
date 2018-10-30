package com.bcv.lessons.Lesson2018_10_29;

public abstract class Gymnast extends Human implements EasyAthlete {
    @Override
    public void pushUp(int set, int amount) {
        System.out.println("I make pushUp" + set + " sets" + " x" + amount + " amount");
    }

    @Override
    public void pullUp(int set, int amount) {
        System.out.println("I make pullUp" + set + " sets" + " x" + amount + " amount");
    }

    @Override
    public void run(int distance) {
        System.out.println("I ran " + distance + " kilometers");
    }

    @Override
    public void parallelBarsPushUps(int set, int amount) {
        System.out.println("I make parallelBarsPushUps " + set + " sets" + " x" + amount + " amount");
    }

    @Override
    public void makePhisicalExercise() {
        System.out.println("Start exercise");
        pushUp(4, 25);
        pullUp(4, 6);
        parallelBarsPushUps(4, 20);
        run(3);

    }

    abstract void makeHorizon();

    abstract void swallow();
}
