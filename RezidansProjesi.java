public class RezidansProjesi {
    
    class Daire {
        private int metrekare;
        private int katNo;
        private String cephe;
        private double toplamFiyat; // Değişken ismini camelCase yaptım

        public Daire(int metrekare, int katNo, String cephe) {
            this.metrekare = metrekare;
            this.katNo = katNo;
            this.cephe = cephe;
            this.toplamFiyat = 0.0;
        }

        public void fiyatHesapla() {
            // 1. ADIM: Baz Fiyatı Hesapla
            double bazFiyat = metrekare * 30000;
            double guncelFiyat = bazFiyat;

            System.out.println("Baz fiyat: " + bazFiyat + " TL");

            // 2. ADIM: Kat Durumunu Kontrol Et (Döngüye gerek yok!)
            if (this.katNo >= 10) {
                guncelFiyat = guncelFiyat * 1.25; // %25 Ekle
                System.out.println("Manzara farkı eklendi (+%25).");
            } 
            else if (this.katNo == 0) {
                guncelFiyat = guncelFiyat * 0.90; // %10 İndir
                System.out.println("Zemin kat indirimi yapıldı (-%10).");
            }
            // Ara katlarda (1-9) fiyata dokunmuyoruz, o yüzden else'e gerek yok.

            // 3. ADIM: Cephe Durumunu Kontrol Et
            // String kıyaslamasında .equals veya .equalsIgnoreCase kullanılır.
            if (this.cephe.equalsIgnoreCase("Güney")) {
                guncelFiyat = guncelFiyat * 1.12; // %12 Ekle
                System.out.println("Güney cephe farkı eklendi (+%12).");
            } 
            else if (this.cephe.equalsIgnoreCase("Kuzey")) {
                guncelFiyat = guncelFiyat * 0.95; // %5 İndir
                System.out.println("Kuzey cephe indirimi yapıldı (-%5).");
            }

            // Sonucu kaydet ve yazdır
            this.toplamFiyat = guncelFiyat;
            System.out.println("--------------------------------");
            System.out.println("DAİRE NİHAİ SATIŞ FİYATI: " + this.toplamFiyat + " TL");
        }
    }
}

// Kodu denemek için Main Sınıfı
class TestRezidans {
    public static void main(String[] args) {
        RezidansProjesi proje = new RezidansProjesi();
        
        // Inner Class (Daire) Nesnesi Oluşturma
        // 120 m2, 15. Kat (Manzaralı), Güney Cephe
        RezidansProjesi.Daire benimDairem = proje.new Daire(120, 15, "Güney");
        
        benimDairem.fiyatHesapla();
    }
}