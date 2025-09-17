// Java Loops: while and do-while example

public class Loops2 {
    public static void main(String[] args) {
        
        int num = 5;              // Number for multiplication table
        int multiplication = 1;   // Counter

        // ---- while loop example ----
        /*
        while (multiplication <= 10) { // condition
            System.out.println(String.format("%d x %d = %d", num, multiplication, num * multiplication));
            multiplication++; // increment
        }
        */

        // ---- do-while loop example ----
        // Executes at least once, then checks the condition
        do {
            System.out.println(String.format("%d x %d = %d", num, multiplication, num * multiplication));
            multiplication++; // increment
        } while (multiplication <= 10);
    }
}
