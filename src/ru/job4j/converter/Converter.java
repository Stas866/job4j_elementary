package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 110;
        int expected = 1;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        int euro = Converter.rubleToEuro(110);
        System.out.println("110 rubles are " + euro + " euro. ");
        System.out.println("Test result : " + passed);

        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected == out2;
        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar. ");
        System.out.println("Test result : " + passed);

        int in3 = 130;
        int expected3 = 9100;
        int out3 = euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        int ruble = Converter.euroToRuble(130);
        System.out.println("130 euro are " + ruble + " ruble. ");
        System.out.println("Test result : " + passed);

        int in4 = 140;
        int expected4 = 8400;
        int out4 = dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        int ruble1 = Converter.dollarToRuble(140);
        System.out.println("140 dollars are " + ruble1 + " ruble. ");
        System.out.println("Test result : " + passed);

    }
}

