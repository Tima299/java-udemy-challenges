package ArrayListChallenge;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printAction();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }
private static void addItems(ArrayList<String> groceries) {
    System.out.println("Add item(s) [separate items by comma]:");
    String[] items = sc.nextLine().split(",");
//    groceries.addAll(List.of(items));
    for (String i : items) {
        String trimmed = i.trim();
        if(groceries.indexOf(trimmed) < 0) {
            groceries.add(trimmed);
        }
    }
}
private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = sc.nextLine().split(",");
//        groceries.removeAll(List.of(items));
    for (String i : items) {
        String trimmed = i.trim();
            groceries.remove(trimmed);
    }
}
    public static void printAction() {
        String textBlock = """
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action to perform:""";
        System.out.println(textBlock + " ");
    }
}
