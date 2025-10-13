import java.util.Scanner;

public class sayilar{
    public static void main(String[] args){
        int[] sayilarDizi = new int[5];
        int poz = 0, neg = 0, sifir = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println(String.format("%d. Sayıyı giriniz: ", i + 1));
            sayilarDizi[i] = input.nextInt();
        }
        input.close();

        for(int sayi: sayilarDizi){
            if(sayi > 0) poz++;
            else if(sayi < 0) neg++;
            else sifir++;
        }
        System.out.println(String.format("Pozitif: %d\nNegatif: %d\nSıfır: %d", poz, neg, sifir));
    }
}