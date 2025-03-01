package AllAboutStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        printInformation(str);
        System.out.printf("index of r = %d %n", str.indexOf('r'));
        System.out.printf("index of Temur = %d %n", str.indexOf("Temur"));
        System.out.printf("index of r = %d %n", str.lastIndexOf('r'));
        System.out.printf("index of Temur = %d %n", str.indexOf("Temur", 12));
        System.out.printf("index of r = %d %n", str.lastIndexOf('r', 6));
        String strLower = str.toLowerCase();
        if (str.equals(strLower)) {
            System.out.println("Values match exactly");
        }
        if (str.equalsIgnoreCase(strLower)) {
            System.out.println("Values match ignoring case");
        }
        if (str.startsWith("Temur")) {
            System.out.println("String starts with Temur");
        }
        if (str.endsWith("Temur")) {
            System.out.println("String ends with Temur");
        }
        if (str.contains("Temur")) {
            System.out.println("String contains Temur");
        }
        if (str.contentEquals("Temur")) {
            System.out.println("String matches Temur");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        if (string.isEmpty()) {
            System.out.println("String is empty!");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is blank!");
            System.out.println("Fill with string!");
            return;
        }
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}