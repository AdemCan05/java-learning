import java.util.ArrayList;
class Masa{
    public int MasaNo;

    public Masa(int masaNo){
        this.MasaNo = masaNo;
    }
    class Siparisler{
        private String yemekAdi;
        private int adet;
        private double fiyat;


        public Siparisler(int masaNo,String yemekAdi, int adet, double fiyat){
            super();
            this.yemekAdi = yemekAdi;
            this.adet = adet;
            switch(yemekAdi){
                case "Pizza":
                    this.fiyat = 50.0 * adet;
                    break;
                case "Burger":
                    this.fiyat = 30.0 * adet;
                    break;
                case "Pasta":
                    this.fiyat = 40.0 * adet;
                    break;
                default:
                    this.fiyat = fiyat * adet;
                    break;
            }
        }
        public void siparisDetay(){
            System.out.println("Yemek Adı: " + yemekAdi + ", Adet: " + adet);
            System.out.println("Masa No: " + MasaNo + ", Fiyat: " + fiyat);
        }
    }
}
class testRestorant{
    public static void main(String[] args){
        ArrayList<Masa.Siparisler> siparisler = new ArrayList<Masa.Siparisler>();
        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);
        Masa.Siparisler siparis1 = masa1.new Siparisler(1,"Pizza",2,50.0);
        Masa.Siparisler siparis2 = masa2.new Siparisler(2,"Burger",1,30.0);
        siparisler.add(siparis1);
        siparisler.add(siparis2);

        for(Masa.Siparisler siparis : siparisler){
            siparis.siparisDetay();
        }
    }
}