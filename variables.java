/* 
   --- Variable Naming Rules in Java ---
   int age = 25;       // ✅ Geçerli
   age = 3;            // ✅ Geçerli (varolan değişkene yeni değer atanabilir)

   int age = 30;       // ❌ Hatalı (aynı isimle tekrar değişken tanımlanamaz)
   int _num = 50;      // ✅ Geçerli ama tavsiye edilmez
   int $num = 60;      // ✅ Geçerli ama tavsiye edilmez
   int 1num = 70;      // ❌ Hatalı (değişken adı rakamla başlayamaz)
   int first Num = 80; // ❌ Hatalı (değişken adında boşluk olamaz)
   int firstNum = 90;  // ✅ Geçerli ve önerilen kullanım (camelCase)
*/

public class Variables {
    public static void main(String[] args) {
        
        // Tamsayılar için "int"
        int age = 25; 
        age = 3; // yeniden değer atama (reassign)

        // Ondalıklı sayılar için "double"
        double price = 19.99; 

        // Daha küçük ondalık tür için "float" (sonunda 'f' gerekir)
        float pi = 3.14f; 

        // Mantıksal değerler için "boolean"
        boolean isJavaFun = true; 

        // Tek karakter için "char" (tek tırnak içinde yazılır)
        char grade = 'A'; 

        // Çıktı
        System.out.println(
            "Age: " + age +
            ", Price: " + price +
            ", Pi: " + pi +
            ", Is Java Fun? " + isJavaFun +
            ", Grade: " + grade
        );
    }
}
