import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome Calculator!\nChoose an operation (+, -, *, /): ");
        String operation = input.nextLine();
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        input.nextLine();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        switch (operation) {
            case "+":
                System.out.printf("Result: %.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;
            case "-":
                System.out.printf("Result: %.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;
            case "*":
                System.out.printf("Result: %.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.printf("Result: %.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose one of +, -, *, /.");
                break;
            }
        input.close();

        
    }
}