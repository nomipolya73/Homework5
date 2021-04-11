
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int number;
        while (true) {
            System.out.print("Введите любое целое число от 100 до 100000000: ");
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
            if ((number>=100) & (number <= 100000000)) break;
        }
            String s = Integer.toString(number);
            int[] arr = new int[s.length()];
            for (int i = s.length() - 1;
                 i >= 0; i--) {
                arr[i] = number % 10;
                number /= 10;
            }
            int count1 = 0;
            int count2 = 0;
            for (int i = s.length() - 1;
                 i >= 0; i--) {
                if (arr[i] % 2 == 0) count1++;
                else count2++;
            }
            double а = (double) count1 * 100 / s.length();
            double b = (double) count2 * 100 / s.length();

            System.out.println("четных цифр " + а + "%");
            System.out.println("нечетных цифр " + b + "%");
        }
    }


