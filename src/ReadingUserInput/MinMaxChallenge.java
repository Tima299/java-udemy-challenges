package ReadingUserInput;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        double number = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        while (true) {
            System.out.println("Enter a number: ");
            try {
                number = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You are quitting the loop!");
                break;
            }
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        scanner.close();
        System.out.println("___________________________________");
        System.out.println("Minimum number entered is " + min);
        System.out.println("Maximum number entered is " + max);
    }
}
