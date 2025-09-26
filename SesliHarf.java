import java.util.Scanner;

public class SesliHarf{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = input.nextLine().toLowerCase();
        input.close();
        int sesliHarfSayisi = 0;
        for(char harf : kelime.toCharArray()){
            if (isSesliHarf(harf)){
                sesliHarfSayisi++;
            }
        }
        System.out.println("Girdiğiniz kelimedeki sesli harf sayısı: " + sesliHarfSayisi);
    }
    public static boolean isSesliHarf(char harf){
        char[] sesliHarfler = {'a', 'e', 'i', 'o', 'u', 'ü', 'ö', 'ı'};
        for (char sesli : sesliHarfler){
            if (harf == sesli)
                return true;
        }
        return false;
    }
}