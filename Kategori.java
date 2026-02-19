public enum Kategori {
    GIDA(0.01), GIYIM(0.08), ELEKTRONIK(0.25);
    
    private final double kdvDegeri;

    Kategori(double kdvDegeri){
        this.kdvDegeri = kdvDegeri;
    }
    public double getKdvDegeri(){
        return kdvDegeri;
    }
}

class Urun{
    private String ad;
    private double fiyat;
    private Kategori kdvDegeri;

    public Urun(String ad, double fiyat, Kategori kdvDegeri){
        this.ad = ad;
        this.fiyat = fiyat;
        this.kdvDegeri = kdvDegeri;
    }
    public double fiyatKdvli(){
        return fiyat + (fiyat * kdvDegeri.getKdvDegeri());
    }
    public void bilgiYaz(){
        System.out.println(" - Ad: " + ad
            + " - Fiyat: " + fiyat
            + " - KDV dahil " + fiyatKdvli()
        );
    }
    public static void main(String[] args){
        Urun u1 = new Urun("Ekmem", 10, Kategori.GIDA);
        Urun u2 = new Urun("Tshirt", 250, Kategori.GIYIM);
        Urun u3 = new Urun("Macbook m3 max", 99.999, Kategori.ELEKTRONIK);

        u1.bilgiYaz();
        System.out.println("--------------");
        u2.bilgiYaz();
        System.out.println("--------------");
        u3.bilgiYaz();
        System.out.println("--------------");
    }
}