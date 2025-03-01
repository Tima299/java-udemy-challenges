package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("bread");
        groceries.add("butter");
        groceries.add("yogurt");
        System.out.println(groceries);
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "soda"));
        System.out.println(nextList);
        groceries.addAll(nextList);
        System.out.println(groceries);
        System.out.println("Third item: " + groceries.get(2));
        if(groceries.contains("mustard")) {
            System.out.println("Mustard is in the list");
        } else {
            System.out.println("Mustard is not in the list");
        }
        groceries.add("yogurt");
        System.out.println("first index of yogurt: " + groceries.indexOf("yogurt"));
        System.out.println("last index of yogurt: " + groceries.lastIndexOf("yogurt"));
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);
    }
}
