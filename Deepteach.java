import java.util.ArrayList;
public interface Deepteach {
    void setButceEkle(double tutar);
    void operations();
}

class DT2025 implements Deepteach {
    private int projeID;
    private String projeAd;
    private double projeButce;

    public DT2025(int projeID, String projeAd, double projeButce) {
        this.projeID = projeID;
        this.projeAd = projeAd;
        this.projeButce = projeButce;
    }
    @Override
    public void setButceEkle(double tutar) {
        this.projeButce += tutar;
    }
    @Override
    public void operations() {
        System.out.println("Proje ID: " + projeID + ", Proje Adı: " + projeAd + ", Proje Butçesi: " + projeButce);
    }
}

class TestDeepteach{
    public static void main(String[] args) {

        ArrayList<Deepteach> projeListesi = new ArrayList<>();

        DT2025 proje1 = new DT2025(1, "Yapay Zeka Destekli Eğitim Platformu", 150000.0);
        proje1.setButceEkle(50000.0);
        projeListesi.add(proje1);


        DT2025 proje2 = new DT2025(2, "Sanal Gerçeklik ile Uzaktan Eğitim", 200000.0);
        proje2.setButceEkle(25000.0);
        projeListesi.add(proje2);

        for (Deepteach proje : projeListesi) {
            proje.operations();
        }


    }

}