package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height1) {
        double rsl = (height1 - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height2) {
        double rsl = (height2 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height1 = 187;
        double man = Fit.manWeight(height1);
        System.out.println("Man 187 is " + man);
        short height2 = 170;
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 170 is " + woman);
    }
}
