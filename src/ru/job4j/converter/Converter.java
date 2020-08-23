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
        int euro = Converter.rubleToEuro(100);
        System.out.println("100 rubles are " + euro + " euro. ");

        int dollar = Converter.rubleToDollar(100);
        System.out.println("100 rubles are " + dollar + " dollar. ");

        int ruble = Converter.euroToRuble(100);
        System.out.println("100 euro are " + ruble + " ruble. ");

        int ruble1 = Converter.dollarToRuble(100);
        System.out.println("100 dollars are " + ruble1 + " ruble. ");

    }
}

