package VarArgs;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello, World!");

        String[] splitStrings = "Hello World".split(" ");
        printText(splitStrings);
        System.out.println(" _ ".repeat(20));
        printText("Hello");
        System.out.println(" _ ".repeat(20));
        printText("Hello", "World", "!");
        System.out.println(" _ ".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", sArray));
    }
    private static void printText(String... textList) {
        for (String text : textList) {
            System.out.println(text);
        }
    }
}
