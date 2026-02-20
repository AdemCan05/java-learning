import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyelini almak istediğiniz sayiyi giriniz: ");
        int n = input.nextInt();
        input.close();

        int sonuc = 1;
        for(int i = 1; i<=n; i++){
            sonuc *= i;
        }
        System.out.println(String.format("%d! = %d", n, sonuc));
    }
    
}
