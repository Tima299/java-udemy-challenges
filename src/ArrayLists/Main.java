package ArrayLists;

import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {
        /*Object[] groceryItems = new Object[3];
        groceryItems[0] = new GroceryItem("Milk");
        groceryItems[1] = new GroceryItem("Eggs", "PROTEIN", 12);
        groceryItems[2] = new GroceryItem("Bread", "GRAIN", 2);
        System.out.println(groceryItems[0]);
        System.out.println(groceryItems[1]);
        System.out.println(groceryItems[2]);*/
        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("Milk");
        groceryItems[1] = new GroceryItem("Eggs", "PROTEIN", 12);
        groceryItems[2] = new GroceryItem("Bread", "GRAIN", 2);
        System.out.println(groceryItems[0]);
        System.out.println(groceryItems[1]);
        System.out.println(groceryItems[2]);
/*        ArrayList.objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add(new GroceryItem("Yogurt", "DAIRY", 1));*/
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt", "DAIRY", 1));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.set(0,
                new GroceryItem("Osh", "cuisine", 12));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
