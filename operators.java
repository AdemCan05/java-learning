// Java'da Operatörler
// Bu örnekte aritmetik, karşılaştırma ve mantıksal operatörlerin nasıl kullanıldığını göreceksiniz.

public class operators {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 5;
        char smallA = 'a';
        char capitalA = 'A';

        // ---- Aritmetik Operatörler ----
        // int sum = num1 + num2;            // toplama
        // int difference = num1 - num2;     // çıkarma
        // int product = num1 * num2;        // çarpma
        // float quotient = (float) num1 / num2; // bölme (float cast edilerek)
        // int remainder = num1 % num2;      // mod (kalan)

        // ---- Karşılaştırma Operatörleri ----
        // System.out.println(num1 == num2);  // eşit mi?  -> false
        // System.out.println(num1 != num2);  // eşit değil mi? -> true
        // System.out.println(num1 > num2);   // büyük mü? -> true
        // System.out.println(num1 < num2);   // küçük mü? -> false
        // System.out.println(num1 >= num2);  // büyük veya eşit mi? -> true
        // System.out.println(num1 <= num2);  // küçük veya eşit mi? -> false

        // ---- Karakter Karşılaştırması ----
        System.out.println(smallA > capitalA); 
        // 'a' (97) > 'A' (65) olduğu için sonuç: true

        // ---- Mantıksal Operatörler ----
        System.out.println(num1 > 6 && num2 < 10);  
        // true && true → true

        System.out.println(num1 < 6 || num2 > 10);  
        // false || false → false
    }
}
