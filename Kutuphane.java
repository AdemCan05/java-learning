import java.util.ArrayList;
public class Kutuphane {
    private ArrayList<CalisamaAlani> Alanlar = new ArrayList<>();
    private class CalisamaAlani{
        private String ad;

        private CalisamaAlani(String ad){
            this.ad = ad;
        }
        public void baslat(){
            System.out.println(ad + " Başladı.");
        }
        public String getAd(){
            return ad;
        }
    }
    public void addAlan(String ad){
        Alanlar.add(new CalisamaAlani(ad));
    }
    public void listAlan(){
        for (CalisamaAlani a: Alanlar){
            System.out.println(a.getAd());
        }
    }
    public void tumBaslat(){
        for (CalisamaAlani c : Alanlar){
            c.baslat();
        }
    }
    
}

class testKutuphane{
    public static void main(String[] args){
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.addAlan("KitapSeverler");
        kutuphane.listAlan();
        kutuphane.tumBaslat();
    }
}
