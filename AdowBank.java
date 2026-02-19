import java.util.ArrayList;
abstract class Hesaplar{
    public String hesapNo;
    public double bakiye;

    public Hesaplar(String hesapNo, double bakiye){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }
    public abstract void hesapBilgileriGoster();

    public abstract void paraYatir(double miktar);

    public abstract void paraCek(double miktar);
    class guvenlik{
        private String sifre;

        public guvenlik(String sifre){
            this.sifre = sifre;
        }

        public boolean sifreDogrula(String girilenSifre){
            return this.sifre.equals(girilenSifre);
        }
    }

static class VadesizHesap extends Hesaplar{
    public VadesizHesap(String hesapNo, double bakiye){
        super(hesapNo, bakiye);
    }

    @Override
    public void hesapBilgileriGoster(){
        System.out.println("Vadesiz Hesap No: " + hesapNo + ", Bakiye: " + bakiye);
    }

    @Override
    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
    }

    @Override
    public void paraCek(double miktar){
        if(bakiye >= miktar){
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }
}
static class VadeliHesap extends Hesaplar{
    private double faizOrani;

    public VadeliHesap(String hesapNo, double bakiye, double faizOrani){
        super(hesapNo, bakiye);
        this.faizOrani = faizOrani;
    }

    @Override
    public void hesapBilgileriGoster(){
        System.out.println("Vadeli Hesap No: " + hesapNo + ", Bakiye: " + bakiye + ", Faiz Oranı: " + faizOrani + "%");
    }

    @Override
    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
    }

    @Override
    public void paraCek(double miktar){
        if(bakiye >= miktar){
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }
}

static class KrediKarti extends Hesaplar{
    private double limit;

    public KrediKarti(String hesapNo, double bakiye, double limit){
        super(hesapNo, bakiye);
        this.limit = limit;
    }

    @Override
    public void hesapBilgileriGoster(){
        System.out.println("Kredi Kartı No: " + hesapNo + ", Bakiye: " + bakiye + ", Limit: " + limit);
    }

    @Override
    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
    }

    @Override
    public void paraCek(double miktar){
        if(bakiye + limit >= miktar){
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye);
        } else {
            System.out.println("Limit aşıldı.");
        }
    }
}

class BankaTest {
    public static void main(String[] args) {
        ArrayList<Hesaplar> hesaplar = new ArrayList<>();

        // Hesapları oluştur
        Hesaplar vadesiz = new VadesizHesap("1001", 2000);
        Hesaplar vadeli = new VadeliHesap("2001", 5000, 2.5);
        Hesaplar kredi = new KrediKarti("3001", 1000, 500);

        // Listeye ekle
        hesaplar.add(vadesiz);
        hesaplar.add(vadeli);
        hesaplar.add(kredi);

        // Polymorphism ile tüm hesaplarda işlemler
        for(Hesaplar h : hesaplar){
            h.hesapBilgileriGoster();
            h.paraYatir(500);
            h.paraCek(1000);
            System.out.println("------");
        }
    }
}}