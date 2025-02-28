package ReverseArrayChallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Reversed Array: " + Arrays.toString(reverse(array)));

    }

    public static int[] reverse(int[] array) {
        int reverseArray[] = Arrays.copyOf(array, array.length);
        int left = 0;
        int right = reverseArray.length - 1;
        while (left < right) {
            int temp = reverseArray[left];
            reverseArray[left] = reverseArray[right];
            reverseArray[right] = temp;
            left++;
            right--;
        }
        return reverseArray;
    }
}
