// String oluşturmanın iki yolu vardır: çift tırnak kullanarak ve new anahtar kelimesi ile.
// Çift tırnak kullanarak oluşturulan stringler daha yaygın ve okunması daha kolaydır.
// new anahtar kelimesi ile oluşturulan stringler ise daha az yaygın olup, genellikle ne olursa olsun yeni bir string nesnesi oluşturmak istediğinizde kullanılır.
public class strings{
    public static void main(String[] args){
        /*String name = "Adem Can"; */ // creating a String using double quotes
        String name = new String("Adem Can"); // creating a String object using the new keyword
        System.out.println("Your name is " + name + ".");
    }
}