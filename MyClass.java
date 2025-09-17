// Java Class Example: Creating Objects and Using Constructor

public class MyClass {
    // ---- Fields ----
    int number;
    String name;
    Double point;

    // ---- Constructor ----
    public MyClass(int number, String name, Double point) {
        this.number = number;
        this.name = name;
        this.point = point;
    }

    // ---- Method to display object information ----
    public void display() {
        System.out.println(String.format(
            "Number: %d\nName: %s\nPoint: %.2f\n", number, name, point
        ));
    }

    // ---- Main method to create objects ----
    public static void main(String[] args) {
        MyClass stu1 = new MyClass(1, "Alice", 95.5);
        MyClass stu2 = new MyClass(2, "Bob", 89.0);

        // Display the information of each student
        stu1.display();
        stu2.display();
    }
}
