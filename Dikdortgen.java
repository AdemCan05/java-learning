public class Dikdortgen{
    protected double genislik;
    protected double yukseklik;

    public Dikdortgen(){
        this.genislik = 1;
        this.yukseklik = 1;
    }
    public Dikdortgen(double genislik){
        this();
        this.genislik = genislik;
    }
    public Dikdortgen(double genislik, double yukseklik){
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }
    public double alan(){
        return genislik * yukseklik;
    }
    public double cevre(){
        return (2 * genislik) + (2 * yukseklik);
    }
    public boolean kareMi(){
        if (yukseklik == genislik) return true;
        else return false;     
    }
    public static void main(String[] args){
        Dikdortgen d1 = new Dikdortgen(4.5, 9.4);
        Dikdortgen d2 = new Dikdortgen(6.4, 3.1);
        Dikdortgen d3 = new Dikdortgen(8.2, 8.2);

        System.out.println("-------1.Değer-------");
        System.out.println("Alan: "+ d1.alan() + ",Çevre: "+ d1.cevre() + " ,Kare mi: " + d1.kareMi());
        System.out.println("----------------------------------");
        System.out.println("-------2.Değer-------");
        System.out.println("Alan: "+ d2.alan() + ",Çevre: "+ d2.cevre() + " ,Kare mi: " + d2.kareMi());
        System.out.println("----------------------------------");
        System.out.println("-------3.Değer-------");
        System.out.println("Alan: "+ d3.alan() + ",Çevre: "+ d3.cevre() + " ,Kare mi: " + d3.kareMi());
        System.out.println("----------------------------------");
    }
}