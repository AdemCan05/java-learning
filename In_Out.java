import java.util.Scanner;

public class In_Out {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.printf("Hello %s! You are %d years old. \nWhat is your study field? ", name, age);
        input.nextLine(); // consume the leftover newline

        String field = input.nextLine();
        System.out.printf("So, you are studying %s.", field);

        input.close();
    }
}