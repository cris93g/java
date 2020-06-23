package udemy_exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.io.Console;

public class IO {
    private static Scanner scanner = new Scanner(System.in);
    private static Console console = System.console();

    public static void main(String[] args) {
        console.printf("Enter Count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        int i = 0;
        while (i < array.length) {
            console.printf("Enter number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
            i++;
        }
        return array;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            int value = arr[i];
            if (value < min) {
                min = value;
            }
            i++;
        }
        return min;
    }
}