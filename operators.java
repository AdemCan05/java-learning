public class operators{
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 5;
        char smallA = 'a';
        char capitalA = 'A';
        /*int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        float quotient = (float) num1 / num2;
        int remainder = num1 % num2;
        
        System.out.println(num1 == num2); // false
        System.out.println(num1 != num2); // true
        System.out.println(num1 > num2); // true
        System.out.println(num1 < num2); // false
        System.out.println(num1 >= num2); // true
        System.out.println(num1 <= num2); // false */

        System.out.println(smallA > capitalA); // true
        System.out.println(num1 > 6 && num2 < 10); // true
        System.out.println(num1 < 6 || num2 > 10); // false
    }
}