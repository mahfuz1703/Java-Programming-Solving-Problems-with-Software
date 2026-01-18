package Collections.Map;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Displaying the elements
        System.out.println("HashMap: " + map);

        // Accessing values by key
        System.out.println("Value for key 2: " + map.get(2));

        // Removing a key-value pair
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Adding a null key and null value
        map.put(null, "NullKey");
        map.put(4, null);
        System.out.println("After adding null key and null value: " + map);

        // Print size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());
    }
}
