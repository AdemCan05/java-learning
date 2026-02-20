import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Asal Sayı Kontrol Uygulamasına Hoş Geldiniz!\nLütfen bir sayı girin: ");
        int number = input.nextInt();
        input.close();
        if (isAsal(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }

    }
    public static boolean isAsal(int number) {
        if (number <= 1) {
            return false; // 1 ve daha küçük sayılar asal değildir
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Bölünebiliyorsa asal değildir
            }
        }
        return true; // Asal sayı
        
    }
}