package module2;

public class Loops {
    public static void main(String[] args) {
        int[] number = new int[5];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        number [3] = 4;
        number [4] = 5;
        int i = 0;
        while (i <= 10  ) {
            System.out.println(i);
            i++;
        }
        int numberOfElements = number.length;
        System.out.println(numberOfElements + "-ilość elementów");
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
        System.out.println("Suma elementów tablicy to: "+ sumNumbers(number));
        }
    public static int sumNumbers (int[] number) {
        int result = 0;
        for(int i = 0; i < number.length; i++) {
            result = result + number[i];
        }
        return result;
    }
}


