import java.util.Scanner;

public class ciftSayilar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaça kadar çift sayıları saymak istiyorsunuz: ");
        int sayi = input.nextInt();
        input.close();

        for(int i = 2; i <= sayi; i+=2){
            System.out.println(i);
        }
    }
}