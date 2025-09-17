// Java HashMap Example with Common Methods

import java.util.HashMap;
import java.util.Map;

public class Hashs {
    public static void main(String[] args) {
        
        // ---- Create a HashMap ----
        // Key: String (item name), Value: Double (price)
        HashMap<String, Double> items = new HashMap<>();

        // ---- Add items to the HashMap ----
        items.put("Apple", 0.99);
        items.put("Banana", 0.59);
        items.put("Orange", 0.79);

        // ---- putIfAbsent example ----
        // Will NOT add because "Apple" already exists
        items.putIfAbsent("Apple", 0.89);

        // ---- Access values ----
        double applePrice = items.get("Apple");  // get value by key
        System.out.println("Price of Apple: " + applePrice);

        // ---- Check if a key or value exists ----
        System.out.println("Contains key 'Banana'? " + items.containsKey("Banana")); 
        System.out.println("Contains value 0.79? " + items.containsValue(0.79));

        // ---- Remove an entry ----
        items.remove("Orange");  // removes key "Orange"
        System.out.println("After removing Orange: " + items);

        // ---- Iterate over entries ----
        System.out.println("\nIterating over HashMap:");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---- Size of the HashMap ----
        System.out.println("\nNumber of items: " + items.size());

        // ---- Clear the HashMap ----
        items.clear();
        System.out.println("After clear(): " + items);  // empty map
    }
}
