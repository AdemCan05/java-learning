interface Uçma{
    void uç();
}
interface Yüzme{
    void yüz();
}
class Kuş implements Uçma{
    public void uç(){
        System.out.println("Kuş uçuyor.");
    }
}
class Balık implements Yüzme{
    public void yüz(){
        System.out.println("Balık yüzüyor.");
    }
}
class Ordek implements Uçma, Yüzme{
    public void uç(){
        System.out.println("Ördek uçuyor.");
    }
    public void yüz(){
        System.out.println("Ördek yüzüyor.");
    }
}
public class testOyun{
    public static void main(String[] args) {
        Kuş kuş = new Kuş();
        kuş.uç();

        Balık balık = new Balık();
        balık.yüz();

        Ordek ordek = new Ordek();
        ordek.uç();
        ordek.yüz();
    }
}