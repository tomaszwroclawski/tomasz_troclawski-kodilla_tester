package module2;

public class AdvCalcApplication {
    public static void main(String[]args){
        AdvCalculator calculator = new AdvCalculator();
        double result = calculator.calculate();
        System.out.println("Wynik działania:  " + result);
    }
}
