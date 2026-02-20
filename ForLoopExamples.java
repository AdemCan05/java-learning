// Java Loops Examples

public class ForLoopExamples {
    public static void main(String[] args) {
        
        // ---- Multiplication Table (Nested for loop) ----
        /*
        for (int num1 = 1; num1 <= 10; num1++) {
            System.out.println(String.format("\nMultiplication table of %d\n", num1));
            
            for (int num2 = 1; num2 <= 10; num2++) {
                System.out.println(String.format("%d x %d = %d", num1, num2, num1 * num2));
            }
        }
        */

        // ---- Fibonacci Series (foreach loop) ----
        int[] fibonacci = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        System.out.println("\nFibonacci Series:");
        for (int number : fibonacci) {
            System.out.println(number);
        }
    }
}
