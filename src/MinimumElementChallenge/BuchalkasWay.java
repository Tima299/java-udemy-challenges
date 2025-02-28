package MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class BuchalkasWay {
    public static void main(String[] args) {
int [] returnedArray = readIntegers();
        System.out.println("The array is: " + Arrays.toString(returnedArray));
        System.out.println("The minimum value is: " + findMin(returnedArray));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }
        return numbers;
    }
    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (min > el) {
                min = el;
            }
        }
        return min;
    }
}
