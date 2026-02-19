import java.util.ArrayList;

public class EtkinlikAlani {
    private ArrayList<Oturum> oturumlar = new ArrayList<>();
    // private olmalı çünkü dışarıdan erişilmemli ve oluşturulmamalı
    private class Oturum {
        private String ad;

        private Oturum(String ad) {
            this.ad = ad;
        }

        public String getAd() {
            return ad;
        }

        public void baslat() {
            System.out.println(ad + " oturumu başladı.");
        }
    }

    public void oturumEkle(String ad) {
        oturumlar.add(new Oturum(ad));
    }

    public void oturumlariGoster() {
        for (Oturum o : oturumlar) {
            System.out.println(o.getAd());
        }
    }

    public void tumOturumlariBaslat() {
        for (Oturum o : oturumlar) {
            o.baslat();
        }
    }
}

class TestEtkinlik {
    public static void main(String[] args) {
        EtkinlikAlani alan = new EtkinlikAlani();

        alan.oturumEkle("Kitap Okuma");
        alan.oturumEkle("Ders Çalışma");

        alan.oturumlariGoster();
        alan.tumOturumlariBaslat();
    }
}
