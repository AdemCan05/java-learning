// String oluşturmanın iki yolu vardır: 
// 1. Çift tırnak kullanarak 
// 2. new anahtar kelimesi ile
//
// Çift tırnak kullanarak oluşturulan Stringler daha yaygın ve okunması daha kolaydır.
// new anahtar kelimesi ile oluşturulan Stringler ise daha az yaygındır. 
// Genellikle ne olursa olsun yeni bir String nesnesi oluşturmak istediğinizde kullanılır.

public class strings {
    public static void main(String[] args) {
        
        // String oluşturma örnekleri:
        // String name = "Adem Can";                // çift tırnak ile
        // String name = new String("Adem Can");    // new anahtar kelimesi ile

        String name = "Adem Can";

        // Sürekli "+" kullanmak yerine String.format() ile biçimlendirme yapabilirsiniz:
        // int age = 20;
        // String helloName = String.format("Hello %s! You are %d years old.", name, age);
        // System.out.println(helloName);

        // Boş olup olmadığını kontrol etme
        if (name.isEmpty()) {
            System.out.println("Name is empty");
        } else {
            System.out.println("Name is not empty");
        }
    }
}
