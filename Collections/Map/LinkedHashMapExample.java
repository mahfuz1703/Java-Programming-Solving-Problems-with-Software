package Collections.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Displaying the elements
        System.out.println("LinkedHashMap: " + map);

        // Accessing values by key
        System.out.println("Value for key 2: " + map.get(2));

        // Removing a key-value pair
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // Iterating through the LinkedHashMap
        System.out.println("Iterating through the LinkedHashMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Adding a null key and null value
        map.put(null, "NullKey");
        map.put(4, null);
        System.out.println("After adding null key and null value: " + map);

        // Print size of the LinkedHashMap
        System.out.println("Size of the LinkedHashMap: " + map.size());
    }
}
