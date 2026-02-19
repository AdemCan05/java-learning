import java.util.Scanner;

public class VizeSoru4 {

    // g(x) = x^2 + 2x + 1
    static double gx(double x) {
        return x * x + 2 * x + 1;
    }

    // g(x, y) = (x^2 + 5x) / (3y)
    static double gy(double x, double y) {
        if (y == 0) {
            System.out.println("Hata: y sıfır olamaz!");
            return 0;
        }
        return (x * x + 5 * x) / (3 * y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç değer gireceksiniz? (1 veya 2): ");
        int n = scanner.nextInt();  // kullanıcıdan kaç değer girileceğini alıyoruz

        switch (n) {
            case 1 -> {
                System.out.print("x = ");
                double x = scanner.nextDouble();  // sadece x al
                System.out.println("gx(" + x + ") = " + gx(x));
            }

            case 2 -> {
                System.out.print("x = ");
                double x = scanner.nextDouble();
                System.out.print("y = ");
                double y = scanner.nextDouble();  // x ve y ayrı ayrı al
                System.out.println("gy(" + x + ", " + y + ") = " + gy(x, y));
            }

            default -> System.out.println("Geçersiz giriş! Sadece 1 veya 2 değer girilebilir.");
        }

        scanner.close();
    }
}
