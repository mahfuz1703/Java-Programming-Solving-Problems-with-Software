package Collections.Set;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Displaying the elements
        System.out.println("HashSet: " + set);

        // Trying to add duplicate element
        boolean isAdded = set.add("Apple");
        System.out.println("Trying to add duplicate 'Apple': " + isAdded);
        System.out.println("HashSet after trying to add duplicate: " + set);

        // Removing an element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Adding a null element
        set.add(null);
        System.out.println("After adding null: " + set);

        // Print size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());
    }
}
