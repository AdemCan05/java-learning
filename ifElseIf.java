import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print(String.format("Hello %s! Enter your age: ", name));
        int age = input.nextInt();
        input.close();
        
        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 18) {
            System.out.println(String.format("%s, you are a minor.", name));
        } else if (age < 65) {
            System.out.println(String.format("%s, you are an adult.", name));
        } else {
            System.out.println(String.format("%s, you are a senior.", name));
        }

        
    }
    
}
