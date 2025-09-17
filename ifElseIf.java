import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.close();
        
        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }

        
    }
    
}
