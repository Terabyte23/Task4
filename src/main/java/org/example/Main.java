package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int count = 0;

        while (count < 100) {
            int num = random.nextInt(100);
            if (num % 2 != 0) {
                array[count] = num;
                count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        Arrays.sort(array);

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println("\nСреднее арифметическое: " + average);
    }
}