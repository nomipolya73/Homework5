package com.blinder.lessons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Счастливый ли билет? Выбираем билет генератором случайных чисел

        final int min = 1; // Минимальное число для диапазона
        final int max = 999999; // Максимальное число для диапазона
        final int rnd = rnd(min, max);

        System.out.println("случайное целое число: " + rnd);

        int number1 = rnd / 100000;
        int number2 = (rnd / 10000) % 10;
        int number3 = (rnd / 1000) % 10 % 10;
        int number4 = (rnd / 100) % 10 % 10 % 10;
        int number5 = (rnd / 10) % 10 % 10 % 10 % 10;
        int number6 = rnd % 10 % 10 % 10 % 10;
        if (number1 + number2 + number3 == number4 + number5 + number6) {
            System.out.println("Билет счастливый");
        } else System.out.println("Билет несчастливый");

        // счастливый ли билет. пользователь вводит число сам.
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String ticket;
        while (true) {
            System.out.println("Введите 6-значный номер билета");
            ticket = scanner.nextLine();
            if (ticket.matches("\\d\\d\\d\\d\\d\\d")) break;
        }
        int ticketvalue = Integer.parseInt(ticket);
        int n1 = ticketvalue / 100000;
        int n2 = (ticketvalue / 10000) % 10;
        int n3 = (ticketvalue / 1000) % 10 % 10;
        int n4 = (ticketvalue / 100) % 10 % 10 % 10;
        int n5 = (ticketvalue / 10) % 10 % 10 % 10 % 10;
        int n6 =ticketvalue % 10 % 10 % 10 % 10;
        if (n1 + n2 + n3 == n4 + n5 + n6) {
            System.out.println("Билет счастливый");
        } else System.out.println("Билет несчастливый");


        //Пользователь вводит последовательность цифр. Определить, стоят ли цифры в числе по возрастанию/убыванию.
        System.out.println();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Введите размер последовательности ");
        int size1 = input1.nextInt();
        int array[] = new int[size1];
        System.out.println("Ввведите элементы последовательности");
        for (
                int i = 0;
                i < size1; i++) {
            array[i] = input1.nextInt();
        }
        System.out.println("Введенные элементы:");
        boolean condition = true;
        for (
                int i = 0;
                i < size1 - 1; i++) {
            if (array[i + 1] <= array[i]) {
                condition = false;
            }
            if (condition == true)
                System.out.println("по возрастанию");
            else System.out.println("не по возрастанию");
        }
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;

    }
}


//Scanner sc = new Scanner(System.in);
// System.out.println("Введите шестизначный код:");

//if (sc.hasNextInt()) {
///int number = sc.nextInt();
//System.out.println("Спасибо! Вы ввели код " + number);
//} else {
///  System.out.println("Извините, в воде ошибка. Перезапустите программу и попробуйте снова!");



