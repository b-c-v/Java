package com.bcv.finalProject.FlatArea;


public final class ButtJoint {


    public static double c20(double S, double b, double e, double g, double g1, double e1, double c, double b1, int alpha) {
        return (S + b1) * b + Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * (e * g + e1 * g1);
    }

    public static double y2(double S, double b, double e, double g, double R) {
        return (S + R) * b + 0.215 * Math.pow(S + R, 2) + 0.75 * e * g;
    }

    public static double c28(double S, double b, double e, double g, double R) {
        return (S + R) * b + 0.43 * Math.pow(S + R, 2) + 0.75 * e * g;
    }

    public static double h1(double K) {
        return 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double h2(double K) {
        return Math.pow(K, 2) + 2.1 * K;
    }

    public static double c17(double S, double b, double e, double g, double g1, double e1, double c, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * (e * g + e1 * g1);
    }

    public static double y9(double S, double b, double e, double g, double c, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * e * g;
    }

    public static double c45(double S, double b, double e, double g, double g1, double e1, double c, double h, double f, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(alpha) + 0.5 * f * (2 * h - f) + Math.PI * Math.pow(f, 2) / 8 + 0.75 * (e * g + e1 * g1);
    }

    public static double c19(double S, double b, double e, double g, double c, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * e * g;
    }

    public static double y10(double S, double b, double e, double g, double K, double c, int alpha) {
        return S * b + Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * e * g + 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double c14(double S, double b, double e, double g, double g1, double e1, double c, double h, int beta, int alpha) {
        return S * b + Math.pow(S - h, 2) * Math.tan(alpha) + Math.pow(h - c, 2) * Math.tan(beta) + 2 * (h - c) * (S - h) * Math.tan(beta) + 0.75 * (e * g + e1 * g1);
    }

    public static double y8(double S, double b, double e, double g, double g1, double e1, double c, int alpha) {
        return S * b + 0.25 * Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * (e * g + e1 * g1);
    }

    public static double c15(double S, double b, double e, double g, double c, int alpha) {
        return S * b + 0.25 * Math.pow(S - c, 2) * Math.tan(alpha) + 1.5 * e * g;
    }

    public static double c12(double S, double b, double e, double g, double g1, double e1, double c, int alpha) {
        return S * b + 0.5 * Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * (e * g + e1 * g1);
    }

    public static double c10(double S, double b, double e, double g, double c, int alpha) {
        return S * b + 0.5 * Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * e * g;
    }

    public static double c25(double S, double b, double e, double g, double g1, double e1, double c, double h, double R, int beta, int alpha) {
        return S * b + 0.5 * Math.pow(S - c, 2) * Math.tan(alpha) + 1.5 * e * g;
    }

    public static double t7(double S, double b, double e, double g, double K, double c, int alpha) {
        return S * b + 0.5 * Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * e * g + 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double c43(double S, double b, double e, double g, double g1, double e1, double c, double h, int beta, int alpha) {
        return S * b + 0.5 * Math.pow(h, 2) * Math.tan(alpha) + Math.pow(S - c - h, 2) * Math.tan(beta) + 0.75 * (e * g + e1 * g1);
    }

    public static double y4(double S, double b, double n, double K) {
        return S * b + 0.5 * Math.pow(n, 2) + 1.05 * K;
    }

    public static double y4(double S, double b, double e, double g, double n) {
        return S * b + 0.5 * Math.pow(n, 2) + n * Math.pow(S - n, 2) + 0.75 * g * (e - n);
    }

    public static double y5(double S, double b, double n, double K) {
        return S * b + 0.5 * Math.pow(n, 2) + 1.05 * n + 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double y5(double S, double b, double e, double g, double n, double K) {
        return S * b + 0.5 * Math.pow(n, 2) + n * (S - n) + 0.75 * (e + n) * g + 0.5 * K;
    }

    public static double c11(double S, double b, double e, double g, int alpha) {
        return S * b + 0.5 * Math.pow(S, 2) * Math.tan(alpha) + 0.75 * e * g;
    }

    public static double c2(double S, double b, double e, double g, double g1, double e1) {
        return S * b + 0.75 * (e * g + e1 * g1);
    }

    public static double c1(double S, double b, double e, double g) {
        return S * b + 0.75 * e * g;
    }

    public static double c13(double S, double b, double e, double g, double g1, double e1, double c, double R, int alpha) {
        return S * b + 0.785 * Math.pow(R, 2) + R * (S - c - R) + 0.5 * Math.pow(S - c, 2) * Math.tan(alpha) + 0.75 * (e * g + e1 * g1);
    }

    public static double t2(double S, double b, double e, double g, double c, double K, double R, int alpha) {
        return S * b + 0.785 * Math.pow(R, 2) + R * (S - c - R) + 0.5 * Math.pow(S - c - R, 2) * Math.tan(alpha) + 0.75 * e * g + 0.5 * Math.pow(K, 2) + 1.05 * K;
    }

    public static double c16(double S, double b, double e, double g, double c, double R, int alpha) {
        return S * b + 1.57 * Math.pow(R, 2) + R * (S - c - 2 * R) + 0.25 * Math.pow(S - c - 2 * R, 2) * Math.tan(alpha) + 1.5 * e * g;
    }

    public static double c40(double S, double b, double e, double g, double g1, double e1, double c, double h, double R, int beta, int alpha) {
        return S * b + 1.57 * Math.pow(R, 2) + 2 * R * (h - R) + Math.pow(h - R, 2) * Math.tan(alpha) + Math.pow(S - c - h, 2) * Math.tan(beta) + 0.75 * (e * g + e1 * g1);
    }

    public static double c23(double S, double b, double e, double g, double g1, double e1, double c, double R, int alpha) {
        return S * b + 1.57 * Math.pow(R, 2) + 2 * R * (S - c - R) + Math.pow(S - c - R, 2) * Math.tan(alpha) + 0.75 * (e * g + e1 * g1);
    }

    public static double c7(double S, double b, double e, double g) {
        return S * b + 1.5 * e * g;
    }

    public static double c27(double S, double b, double e, double g, double c, double h, int beta, int alpha) {
        return S * b + 2 * Math.pow(h, 2) * Math.tan(alpha) + 0.5 * Math.pow(S - c - 2 * h, 2) * Math.tan(beta) + 2 * h * (S - c - 2 * h) * Math.tan(beta) + 1.5 * e * g;
    }

    public static double c42(double S, double b, double e, double g, double g1, double e1, double h, double f) {
        return S * b + Math.PI * Math.pow(f, 2) / 8 + f * (h - 0.5 * f) + 0.75 * (e * g + e1 * g1);
    }

    public static double c26(double S, double b, double e, double g, double c, double R, int alpha) {
        return S * b + Math.PI * Math.pow(R, 2) + Math.pow(S - c - 2 * R, 2) * R + 0.5 * Math.pow(S - c - 2 * R, 2) * Math.tan(alpha) + 1.5 * e * g;
    }

    public static double c39(double S, double b, double e, double g, double g1, double e1, double c, double h, int alpha) {
        return S * b + Math.pow(h, 2) * Math.tan(alpha) + Math.pow(S - c - h, 2) * Math.tan(alpha) + 0.75 * (e * g + e1 * g1);
    }
}