package com.bcv.hw.FinalProject;

class ComputationsFlatArea {


    public static double squareButtWeld(double S, double b, double e, double g) {

        double F = (S * b) + (1.5 * e * g);
        return F;
    }

    public static double UWeld(double S, double b, double R, double c, double e, double g, double e1, double g1, double angle) {

        double F = S * b + 1.57 * R * R + (S - c - R) * 2 * R + (S - c - R) * (S - c - R) * Math.tan(angle) + 0.75 * (e * g + e1 * g1);
        return F;
    }


}

