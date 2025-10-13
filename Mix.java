import java.util.Scanner;

public class Mix {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Mix uygulamasına hoş geldiniz! \nKaç tane sayı gireceksiniz: ");
        int n = inputs.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = inputs.nextInt();
        }
        inputs.close();
        System.out.println("Girilen sayılar arasında en büyük sayı: " + findMax(numbers));
        System.out.println("Girilen sayılar arasında en küçük sayı: " + findMin(numbers));
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
