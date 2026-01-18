package Collections.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayLis
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Displaying the elements
        System.out.println("Fruits in the list: " + fruits);

        // Insert an element at a specific index
        fruits.add(1, "Orange");
        System.out.println("After adding Orange at index 1: " + fruits);

        // Access elements by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // Remove elements by index
        fruits.remove(0);
        System.out.println("After removing element at index 0: " + fruits);

        // Iterate through the ArrayList
        System.out.println("Iterating through the list:");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        // add null element
        fruits.add(null);
        System.out.println("After adding null: " + fruits);

        // print size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());
    }
}
