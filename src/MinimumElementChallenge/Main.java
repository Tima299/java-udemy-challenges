package MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter comma-delimited numbers:");
        String str = sc.nextLine();
        int[] numbers = readIntegers(str);
        System.out.println(Arrays.toString(numbers));
        System.out.println(findMin(numbers));
    }

    public static int[] readIntegers(String str) {
        String[] parts = str.split(",");
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i].trim());
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
