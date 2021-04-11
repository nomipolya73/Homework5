
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Problem5 {
    public static void main(String[] args) {
        int hours = 0;
        double ameba = 1;
        while (hours <= 24) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите количество часов");
            hours = scan.nextInt();
            if (hours % 3 == 0) ameba = pow(2, hours / 3);
            else System.out.println("введите правильное количество часов");
            System.out.println(ameba + " клеток");

        }

    }
}
