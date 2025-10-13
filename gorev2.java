import java.util.Scanner;

public class gorev2{
    public static void main(String[] args){
        int[] sayiDizi = new int[3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println(String.format("%d. sayıyı giriniz: ", i+1));
            sayiDizi[i] = input.nextInt();
        }
        input.close();

        double toplam = 0;
        for(int sayi:sayiDizi){
            toplam += sayi;
        }
        double ortalama = toplam / sayiDizi.length;

        int max = sayiDizi[0];
        for(int sayi: sayiDizi){
            if (sayi > max){
                max = sayi;
            } 
        }
        int min = sayiDizi[0];
        for(int sayi: sayiDizi){
            if (sayi < min){
                min = sayi;
            }
        }
        System.out.println(String.format(
            "Ortalama: %.2f\nMaximum: %d",
            ortalama, max));
        
    }
}