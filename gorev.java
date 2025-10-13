import java.util.Scanner;

public class gorev {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Sayi1 inputing
        System.out.println("İşlem yapmak istediğiniz ilk sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        // Sayi2 inputing
        System.out.println("İşlem yapmak istediğiniz ikinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        input.close();
        int toplama = sayi1 + sayi2;
        int cikarma = sayi1 - sayi2;
        int carpma = sayi1 * sayi2;
        double bolme = (double)sayi1 /sayi2;

        System.out.println(String.format(
            "Toplamanın sonucu: %d\nÇıkarmanın sonucu: %d\nÇarpmanın sonucu: %d\n Bölmenin sonucu: %.2f ",
             toplama, cikarma, carpma, bolme));
    }
}
