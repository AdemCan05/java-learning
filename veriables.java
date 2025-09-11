/* 
    int age = 25;  This is valid
    age = 3;  This is valid (reassigning a new value to the
    int age = 30;  This would duplicate the variable declaration and cause an error
    int _num = 50;  This is valid but not recommended
    int $num = 60;  This is valid but not recommended
    int 1num = 70;  This would cause an error because variable names cannot start with a digit
    int first Num = 80;  This would cause an error because variable names cannot contain spaces
    int firstNum = 90;  This is valid and recommended (camelCase)
    */

public class veriables{
    public static void main(String[] args){
        int age = 25; // int is used for whole numbers
        age = 3; // reassigning a new value to the variable

        double price = 19.99; // double is used for decimal values

        float pi = 3.14f; // float is used for decimal values, requires 'f' suffix

        boolean isJavaFun = true; // boolean can be true or false

        char grade = 'A'; // char is used for single characters, enclosed in single quotes

        System.out.println("Age: " + age + ", Price: " + price + ", Pi: " + pi + ", Is Java Fun? " + isJavaFun + ", Grade: " + grade);
    }
}