public class Laptop {
    private int sarjMiktari = 100;

    public int getSarjMiktari() {
        return sarjMiktari;
    }

    class Batarya{
        public void enerjiTuket(int miktar){
            sarjMiktari -= miktar;
        }

    }
    class TeknikServis{
        public static void ramDegistir(String yeniRam){
            System.out.println("RAM " + yeniRam + " olarak değiştirildi.");
        }
    }
}
class TestLaptop{
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        Laptop.Batarya batarya = laptop.new Batarya();

        System.out.println("Başlangıç Şarj Miktarı: " + laptop.getSarjMiktari() + "%");
        batarya.enerjiTuket(30);
        System.out.println("Şarj Miktarı Tüketildikten Sonra: " + laptop.getSarjMiktari() + "%");

        Laptop.TeknikServis.ramDegistir("16GB");
    }
}
