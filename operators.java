// Operators in Java
// This example demonstrates how to use arithmetic, comparison, and logical operators.

public class Operators {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 5;
        char smallA = 'a';
        char capitalA = 'A';

        // ---- Arithmetic Operators ----
        // int sum = num1 + num2;            // addition
        // int difference = num1 - num2;     // subtraction
        // int product = num1 * num2;        // multiplication
        // float quotient = (float) num1 / num2; // division (cast to float)
        // int remainder = num1 % num2;      // modulus (remainder)

        // ---- Comparison Operators ----
        // System.out.println(num1 == num2);  // equal? -> false
        // System.out.println(num1 != num2);  // not equal? -> true
        // System.out.println(num1 > num2);   // greater than? -> true
        // System.out.println(num1 < num2);   // less than? -> false
        // System.out.println(num1 >= num2);  // greater than or equal? -> true
        // System.out.println(num1 <= num2);  // less than or equal? -> false

        // ---- Character Comparison ----
        System.out.println(smallA > capitalA); 
        // 'a' (97) > 'A' (65), so the result is: true

        // ---- Logical Operators ----
        System.out.println(num1 > 6 && num2 < 10);  
        // true && true → true

        System.out.println(num1 < 6 || num2 > 10);  
        // false || false → false
    }
}
