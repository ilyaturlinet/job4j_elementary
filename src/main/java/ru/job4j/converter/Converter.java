package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float expectedEuro = 2;
        float expectedDollar = 2.3333333f;
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("140 rubles are 2. Test result : " + passedDollar);
    }
}
