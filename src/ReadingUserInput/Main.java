package ReadingUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2025;
   /*     try {
        System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {*/
        System.out.println(getInputFromScanner(currentYear));
        /*   }*/

    }
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hello " + name + "!");
        String birthYear = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(birthYear);
        return "So you are " + age + " years old.";
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("What year were you born? ");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth between " + (currentYear - 125) + " and " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException e) {
                System.out.println("Characters are not allowed. Please enter a valid year of birth.");
            }
        } while (!validDOB);
        return "So you are " + age + " years old.";
    }
    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if(dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return (currentYear - dob);
    }
}

