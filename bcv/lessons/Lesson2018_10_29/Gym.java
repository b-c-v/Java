package com.bcv.lessons.Lesson2018_10_29;

public class Gym {
    public static void main(String[] args) {
        Workouter workouter = new MomyWorkouter();
        workouter.training();

        Bodybuilder bodybuilder = new DadyBodyBuilder();
        bodybuilder.training();

    }
}
