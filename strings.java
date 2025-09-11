// String oluşturmanın iki yolu vardır: 
// 1. Çift tırnak kullanarak 
// 2. new anahtar kelimesi ile
//
// Çift tırnak kullanarak oluşturulan Stringler daha yaygın ve okunması daha kolaydır.
// new anahtar kelimesi ile oluşturulan Stringler ise daha az yaygındır. 
// Genellikle ne olursa olsun yeni bir String nesnesi oluşturmak istediğinizde kullanılır.

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        
        // ---- String oluşturma örnekleri ----
        // String name = "Adem Can";                // çift tırnak ile
        // String name = new String("Adem Can");    // new anahtar kelimesi ile

        String name = "Adem Can Demirci";
        String upperName = name.toUpperCase();

        // ---- String.format() örneği ----
        // int age = 20;
        // String helloName = String.format("Hello %s! You are %d years old.", name, age);
        // System.out.println(helloName);

        // ---- Boş olup olmadığını kontrol etme ----
        /*
        if (name.isEmpty()) {
            System.out.println("Name is empty");
        } else {
            System.out.println("Name is not empty");
        }
        */

        // ---- String parçalama (split) ve birleştirme ----
        
        // Boşluklara göre ayırma
        System.out.println(Arrays.toString(name.split(" "))); 
        // Çıktı: [Adem, Can, Demirci]

        // Her karakteri ayırma
        String[] sub = name.split("");  
        
        // Tekrar birleştirme (join)
        String joined = String.join("", sub);  
        System.out.println(joined); 
        // Çıktı: Adem Can Demirci

        // Büyük harfe çevirme
        System.out.println(name.toUpperCase());
        // Çıktı: ADEM CAN DEMİRCİ

        // Küçük harfe çevirme
        System.out.println(name.toLowerCase());
        // Çıktı: adem can demirci

        // Dizi karşılaştırma (Dizeler referans türü olduğundan, bunları operatör kullanarak karşılaştıramazsınız)
        // equals() metodu büyük/küçük harf duyarlı karşılaştırma yapar
        System.out.println(name.equals(upperName)); // false
        // equalsIgnoreCase() metodu ise büyük/küçük harf duyarsız karşılaştırma yapar
        System.out.println(name.equalsIgnoreCase(upperName)); // true

        // replace() metodu ile değiştirme
        String Javabook = "Hello, World! Welcome to Java. Java is fun but sometimes tricky. I prefer Java over other languages.";
        System.out.println(String.format("Begining: %s", Javabook));
        // Her "Java" kelimesini "Python" ile değiştir
        String Pythonbook = Javabook.replace("Java", "Python"); 
        System.out.println(String.format("After replace: %s", Pythonbook));

        // Alt dize bulma (contains)
        String flowers = "Roses are red, violets are blue.";
        if (flowers.contains("red")) {
            // 0'dan başla, 14'e kadar (14 dahil değil)
            System.out.println("The word 'red' is found. "); 
            // Çıktı: Roses are red
        }else{
            System.out.println("The word 'red' is not found.");
        }

    }   
}
