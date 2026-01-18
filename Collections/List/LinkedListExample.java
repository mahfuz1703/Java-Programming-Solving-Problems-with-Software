package Collections.List;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Displaying the elements
        System.out.println("Fruits in the list: " + fruits);

        // Insert an element at a specific index
        fruits.add(1, "Orange");
        System.out.println("After adding Orange at index 1: " + fruits);

        // add element at last
        fruits.addLast("Mango");
        System.out.println("After adding Mango at the end: " + fruits);

        // add element at first
        fruits.addFirst("Pineapple");
        System.out.println("After adding Pineapple at the beginning: " + fruits);

        // Access elements by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // Remove elements by index
        fruits.remove(0);
        System.out.println("After removing element at index 0: " + fruits);

        // Remove first element
        fruits.removeFirst();
        System.out.println("After removing the first element: " + fruits);

        // Remove last element
        fruits.removeLast();
        System.out.println("After removing the last element: " + fruits);

        // Iterate through the LinkedList
        System.out.println("Iterating through the list:");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        // add null element
        fruits.add(null);
        System.out.println("After adding null: " + fruits);

        // print size of the LinkedList
        System.out.println("Size of the LinkedList: " + fruits.size());
    }
}
