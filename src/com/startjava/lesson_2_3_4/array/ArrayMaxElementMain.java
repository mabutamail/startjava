package com.startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];

        System.out.print("Заполните массив целыми числами через пробел: ");

        for (int i = 0; i < maxLength; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < maxLength; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nМаксимальное число: " + max);
    }
}