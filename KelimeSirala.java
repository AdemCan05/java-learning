import java.util.Scanner;
import java.util.Arrays;

public class KelimeSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kelime sıralama uygulamasına hoş geldiniz! \nKaç tane kelime gireceksiniz: ");
        int n = input.nextInt();
        input.nextLine(); // Dummy nextLine to consume the newline character
        String[] kelimeler = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". kelimeyi giriniz: ");
            kelimeler[i] = input.nextLine();
        }
        input.close();
        System.out.println("Girilen kelimeler: " + Arrays.toString(kelimeler));
        System.out.println("Girilen kelimeler sıralanıyor...");
        Arrays.sort(kelimeler, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sıralanmış kelimeler: " + Arrays.toString(kelimeler));
    }
    
}
