import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ввведите радиус окружности: ");
        double radius = input.nextDouble();
        System.out.println("Введите координаты центра окружности. х: " + "y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        for (int i = 0; i < 5; i++) {


            System.out.println("Введите координаты точки. а: " + "b: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            getDistance(x, y, a, b);
            if (Compare(getDistance(x, y, a, b), radius))
                System.out.println(" точка лежит в круге"); else
            System.out.println(" точка лежит не в круге");
        }
    }

    public static double getDistance(double x, double y, double a, double b) {
        return sqrt(pow((x - a), 2) + pow((y - b), 2));
    }

    public static boolean Compare(double d, double radius) {
        return d <= radius;
    }
}

