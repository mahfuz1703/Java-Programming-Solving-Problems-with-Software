package Collections.Map;
import java.util.TreeMap;
public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");

        // Displaying the elements (will be sorted by keys)
        System.out.println("TreeMap: " + map);

        // Accessing values by key
        System.out.println("Value for key 2: " + map.get(2));

        // Removing a key-value pair
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // Iterating through the TreeMap
        System.out.println("Iterating through the TreeMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Note: TreeMap does not allow null keys, but allows null values
        // Uncommenting the following line will throw a NullPointerException
        // map.put(null, "NullKey");
        map.put(4, null);
        System.out.println("After adding null value for key 4: " + map);

        // Print size of the TreeMap
        System.out.println("Size of the TreeMap: " + map.size());
    }
}
