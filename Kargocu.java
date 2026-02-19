class KargoTakipSistemi {
    private static String firmaAdi = "MNG Kargo";
    private int aktifKargoSayisi;

    public KargoTakipSistemi(int aktifKargoSayisi) {
        this.aktifKargoSayisi = aktifKargoSayisi;
    }

    class KargoBilgi{
        public void kargoDetaylari(){
            System.out.println("Kargo Firması: " + firmaAdi);
            System.out.println("Aktif Kargo Sayısı: " + aktifKargoSayisi);
        }
    }
    static class KargoFirma{
        public void firmaBilgisi(){
            System.out.println("Kargo Firması Bilgisi: " + firmaAdi);
        }
    } 
}
public class Kargocu {
    public static void main(String[] args){
        // İç sınıfın kullanımı
        KargoTakipSistemi kargoTakipSistemi = new KargoTakipSistemi( 150);
        KargoTakipSistemi.KargoBilgi kargoBilgi = kargoTakipSistemi.new KargoBilgi();
        kargoBilgi.kargoDetaylari();

        // Static iç sınıfın kullanımı
        KargoTakipSistemi.KargoFirma kargoFirma = new KargoTakipSistemi.KargoFirma();
        kargoFirma.firmaBilgisi();
    }   
}
