class IsimAnalizUygulamasi {

    // İstenilen Nested (İç İçe) Sınıf
    public static class ASTROLOG {

        // Analiz Fonksiyonu
        public void Analiz(String isim) {
            double toplamPuan = 0;
            
            // Kontrol Dizileri (Büyük/Küçük harf duyarlılığı için hepsi eklendi)
            String sesliHarfler = "aeıioöuüAEIİOÖUÜ";
            // Standart dışı Türkçe'ye özgü harfler (ç, ğ, ı, ö, ş, ü)
            String turkceOzelHarfler = "çğıöşüÇĞIÖŞÜ"; 
            // Yabancı harfler (q, w, x)
            String yabanciHarfler = "qwxQWX";

            System.out.println("--- '" + isim + "' İçin Analiz Sonuçları ---");

            for (int i = 0; i < isim.length(); i++) {
                char harf = isim.charAt(i);
                double harfPuani = 0;
                boolean sesliMi = false;

                // 1. Adım: Sesli mi Sessiz mi?
                if (sesliHarfler.indexOf(harf) != -1) {
                    harfPuani = 20; // Sesli harf
                    sesliMi = true;
                } else {
                    harfPuani = 10; // Sessiz harf
                }

                // 2. Adım: Ek Puan veya Kesinti (Modifier)
                // Not: Türkçe karakterler aynı zamanda sesli veya sessiz grubuna girdiği için
                // önce taban puanı alır, sonra %9 eklenir.
                
                if (turkceOzelHarfler.indexOf(harf) != -1) {
                    // Türkçe karakter için %9 ek puan (Puan * 1.09)
                    harfPuani = harfPuani + (harfPuani * 0.09); 
                } 
                else if (yabanciHarfler.indexOf(harf) != -1) {
                    // Yabancı karakter için %7 kesinti (Puan * 0.93)
                    harfPuani = harfPuani - (harfPuani * 0.07);
                }

                // Harf detayını yazdır
                System.out.println("Harf: " + harf + "\t -> Puan: " + harfPuani);
                
                // Toplama ekle
                toplamPuan += harfPuani;
            }

            System.out.println("---------------------------------");
            System.out.println("TOPLAM İSİM PUANI: " + toplamPuan);
        }
    }

    // Ana (Main) Metot - Fonksiyonu Çağırmak İçin
    public static void main(String[] args) {
        // Nested sınıftan nesne oluşturma
        ASTROLOG astrolog = new ASTROLOG();

        // Örnek: İçinde hem Türkçe (ğ, ü) hem Yabancı (x) hem normal harfler olan bir isim.
        astrolog.Analiz("Adem"); 
    }
}