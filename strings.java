// Strings in Java
// This example demonstrates how to create, manipulate, and compare strings.

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        
        // ---- Creating Strings ----
        // Two ways to create strings:
        // 1. Using double quotes (most common)
        // 2. Using the 'new' keyword (less common, used when you want a new object)
        // String name = "Adem Can";                // using double quotes
        // String name = new String("Adem Can");    // using 'new' keyword

        String name = "Adem Can Demirci";
        String upperName = name.toUpperCase();

        // ---- String.format() example ----
        // int age = 20;
        // String helloName = String.format("Hello %s! You are %d years old.", name, age);
        // System.out.println(helloName);

        // ---- Check if string is empty ----
        /*
        if (name.isEmpty()) {
            System.out.println("Name is empty");
        } else {
            System.out.println("Name is not empty");
        }
        */

        // ---- Splitting and joining strings ----
        
        // Split by spaces
        System.out.println(Arrays.toString(name.split(" "))); 
        // Output: [Adem, Can, Demirci]

        // Split into individual characters
        String[] sub = name.split("");  
        
        // Join characters back into a string
        String joined = String.join("", sub);  
        System.out.println(joined); 
        // Output: Adem Can Demirci

        // Convert to uppercase
        System.out.println(name.toUpperCase());
        // Output: ADEM CAN DEMIRCI

        // Convert to lowercase
        System.out.println(name.toLowerCase());
        // Output: adem can demirci

        // ---- Comparing strings ----
        // Strings are reference types, so you can't use '==' to compare content
        // equals() method is case-sensitive
        System.out.println(name.equals(upperName)); // false
        // equalsIgnoreCase() method ignores case
        System.out.println(name.equalsIgnoreCase(upperName)); // true

        // ---- Replacing substrings ----
        String Javabook = "Hello, World! Welcome to Java. Java is fun but sometimes tricky. I prefer Java over other languages.";
        System.out.println(String.format("Beginning: %s", Javabook));
        // Replace every occurrence of "Java" with "Python"
        String Pythonbook = Javabook.replace("Java", "Python"); 
        System.out.println(String.format("After replace: %s", Pythonbook));

        // ---- Searching for substrings ----
        String flowers = "Roses are red, violets are blue.";
        if (flowers.contains("red")) {
            System.out.println("The word 'red' is found."); 
            // Output: The word 'red' is found.
        } else {
            System.out.println("The word 'red' is not found.");
        }
    }   
}
