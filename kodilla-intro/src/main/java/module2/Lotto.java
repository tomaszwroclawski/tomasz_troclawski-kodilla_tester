package module2;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Lotto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("losuję dla Ciebie liczby. ");
//      int k = in.nextInt();
        int k = 6;
        System.out.println(" Oto twoje wygrane liczby lotto");
        int n;
//      n = in.nextInt();
        n = 49;

        boolean[] lottoNumber = new boolean[n + 1];
        int[] userNumber = new int[k];
        int counter = 0;
        Random random = new Random();
        while (counter < k) {
            int luckyNumber = random.nextInt(49) + 1;
            if (lottoNumber[luckyNumber] == false) {
                userNumber[counter] = luckyNumber;
                lottoNumber[luckyNumber] = true;
                counter++;
            }
        }
        Arrays.sort(userNumber);
        for (int i : userNumber) {
            System.out.println(i);
        }
    }
}




