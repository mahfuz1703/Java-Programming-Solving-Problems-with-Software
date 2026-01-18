package Collections.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Displaying the elements
        System.out.println("LinkedHashSet: " + set);

        // Trying to add duplicate element
        boolean isAdded = set.add("Apple");
        System.out.println("Trying to add duplicate 'Apple': " + isAdded);
        System.out.println("LinkedHashSet after trying to add duplicate: " + set);

        // Removing an element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        // Check existence of an element
        boolean containsCherry = set.contains("Cherry");
        System.out.println("Contains 'Cherry': " + containsCherry);

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Adding a null element
        set.add(null);
        System.out.println("After adding null: " + set);

        // Print size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + set.size());
    }
}
