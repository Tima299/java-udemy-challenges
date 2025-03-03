package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First", "Second", "Third", "Fourth", "Fifth"};
        var originalList = Arrays.asList(originalArray);
        System.out.println("Original List: " + originalList);
        originalList.set(0, "One");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));
        originalList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));
//        originalList.remove(0); //we get an error because the list is fixed size
//      originalList.add("Sixth"); //we get an error because the list is fixed size
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        System.out.println("New List: " + newList);
    }
}
