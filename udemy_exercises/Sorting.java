package udemy_exercises;

import java.util.Scanner;
import java.io.Console;
import java.util.Arrays;

class Sorting {
    private static Scanner scanner = new Scanner(System.in);
    private static Console console = System.console();

    public static void main(String[] args) {
        System.out.println("This is the Sorting Class");
        int[] values = getNums(5);
        printNums(values);
        sortIntegers(values);
        reverse(values);
    }

    public static void sortIntegers(int[] numbers) {
        Arrays.sort(numbers);
        int i = 0;
        while (i < numbers.length) {
            console.printf("%d %n", numbers[i]);
            i++;
        }
    }

    public static void printNums(int[] array) {
        int i = 0;
        while (i < array.length) {
            console.printf("Element index at:%d is value: %d %n", i, array[i]);
            i++;
        }
    }

    public static int[] getNums(int number) {
        console.printf("Enter a number");
        int[] values = new int[number];
        int i = 0;
        while (i < values.length) {
            values[i] = scanner.nextInt();
            i++;
        }
        return values;
    }

    public static void reverse(int[] arr) {
        // im gonna be honest i got kinda confused with the instructions about this one
        // so i reversed it lol.but yea it would be unpure
        Arrays.sort(arr);
        int i = arr.length - 1;
        while (i >= 0) {
            console.printf("%d %n", arr[i]);
            i--;
        }
    }
}
