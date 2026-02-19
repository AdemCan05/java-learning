import java.util.ArrayList;

// Abstract class
abstract class Calisanlar {
    protected String ad;
    protected String soyad;
    protected int yas;

    public Calisanlar(String ad, String soyad, int yas){
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    // Abstract method
    public abstract void maasHesapla();
}

class YazilimGelistirici extends Calisanlar {
    private int SatirSayisi;
    private double satirBasiUcret;

    public YazilimGelistirici(String ad, String soyad, int yas, int SatirSayisi, double satirBasiUcret) {
        super(ad, soyad, yas);
        this.SatirSayisi = SatirSayisi;
        this.satirBasiUcret = satirBasiUcret;
    }
    @Override
    public void maasHesapla() {
        double maas = SatirSayisi * satirBasiUcret;
        System.out.println("Yazılım Geliştirici " + ad + " " + soyad + " maaşı: " + maas + " TL");
    }
}

class ProjeYoneticisi extends Calisanlar {
    private int projeSayisi;
    private double projeBasiUcret;

    public ProjeYoneticisi(String ad, String soyad, int yas, int projeSayisi, double projeBasiUcret) {
        super(ad, soyad, yas);
        this.projeSayisi = projeSayisi;
        this.projeBasiUcret = projeBasiUcret;
    }

    @Override
    public void maasHesapla() {
        double maas = projeSayisi * projeBasiUcret;
        System.out.println("Proje Yöneticisi " + ad + " " + soyad + " maaşı: " + maas + " TL");
    }
}

class Test_Calisanlar{
    public static void main(String[] args){
        ArrayList<Calisanlar> calisanListesi = new ArrayList<Calisanlar>();

        YazilimGelistirici yazilimci1 = new YazilimGelistirici("Ahmet", "Yılmaz", 30, 500, 2.0);
        ProjeYoneticisi yonetici1 = new ProjeYoneticisi("Ayşe", "Kara", 40, 5, 3000.0);

        calisanListesi.add(yazilimci1);
        calisanListesi.add(yonetici1);

        for(Calisanlar calisan : calisanListesi){
            calisan.maasHesapla();
        }
    }
}
