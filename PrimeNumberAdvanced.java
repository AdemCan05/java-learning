import java.util.Scanner;

public class PrimeNumberAdvanced{
    public static void main(String[] args) {
        int[] sayilar = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print((i+1) + ". sayiyi giriniz: ");
            sayilar[i] = input.nextInt();
        }
        input.close();
        int asalSayac = 0;

        for (int sayi : sayilar) {
            if (isAsal(sayi)) {
            asalSayac++;
    }
}
        System.out.println("Girdiğiniz sayılar arasında " + asalSayac + " tane asal sayı var.");

    }
    public static boolean isAsal(int sayi){
        if (sayi < 2) return false;
        for (int i = 2; i <= Math.sqrt(sayi); i++){
            if (sayi % i == 0) return false;
        }
        return true;
    }
}