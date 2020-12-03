package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double c = 5; // podstawa potęgi
        double n = 2;//wykładnik potęgi


        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        double powerResult=calculator.power(c,n);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb "+ a + " i " + b);
        } else {
            System.out.println("Metosa sum nie działa poprawnie dla liczb "+ a + " i " + b);
        }
        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb "+ a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb "+ a + " i " + b);
        }
        boolean correct2 = ResultChecker.assertEquals1(25,powerResult);
        if(correct2) {
            System.out.println("Metoda pow działa poprawnie dla liczb  "+ c + " i " + n);
        } else
            {
            System.out.println("Metoda pow nie działa poprawnie dla liczb "+ c + " i " + n);
        }
    }
}
