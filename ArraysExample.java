// Java ArrayList Example: Adding, Removing, and Copying Elements

import java.util.ArrayList;

class ArraysExample {
    public static void main(String[] args) {
        
        // ---- Create an ArrayList of integers ----
        ArrayList<Integer> numbers = new ArrayList<>();

        // ---- Add numbers 0 to 10 ----
        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("Original List: " + numbers);

        // ---- Remove even numbers using removeIf and lambda ----
        numbers.removeIf(n -> (n % 2 == 0));
        System.out.println("After removing even numbers: " + numbers);

        // ---- Clear all elements (optional) ----
        /*
        numbers.clear();
        System.out.println("After clear(): " + numbers);
        */

        // ---- Copy ArrayList and compare (optional) ----
        /*
        ArrayList<Integer> oddCopy = new ArrayList<>(numbers);
        System.out.println("Is copy equal to original? " + oddCopy.equals(numbers));
        */
    }
}
