abstract class Personel {
    protected String ad;
    protected int personelNo;
    protected boolean aktifMi;

    public Personel(String ad, int personelNo, boolean aktifMi){
        this.ad = ad;
        this.personelNo = personelNo;
        this.aktifMi = aktifMi;
    }
    public void durumGoster(){
        System.out.println("Ad: " + ad + ", Personel No: " + personelNo + ", Aktif Mi: " + aktifMi);
    }
    public boolean isAktifMi(){
        return aktifMi;
    }
}
class Doktor extends Personel{
    private String uzmanlikAlani;
    private int maksHasta = 0; // Başlangıçta 0 hasta kabul edildiğini varsayalım

    public Doktor(String ad, int personelNo, boolean aktifMi, String uzmanlikAlani){
        super(ad, personelNo, aktifMi);
        this.uzmanlikAlani = uzmanlikAlani;
    }
    public void uzmanlikGoster(){
        System.out.println("Uzmanlık Alanı: " + uzmanlikAlani);
    }
    public boolean hastakabulMU(){
        return this.isAktifMi() && maksHasta < 10;
    }
    public void hastaEkle(){
        if (hastakabulMU()){
            maksHasta++;
        }
        else System.out.println("Aktif hasta sayısına ulaşıldı yeni hasta eklenemez.");
    }

}
class Hemsire extends Personel{
    private String calistigiServis;

    public Hemsire(String ad, int personelNo, boolean aktifMi, String calistigiServis){
        super(ad, personelNo, aktifMi);
        this.calistigiServis = calistigiServis;
    }
    public void servisGoster(){
        System.out.println("Çalıştığı Servis: " + calistigiServis);
    }
}
class Sekreter extends Personel{

    Sekreter(String ad, int personelNo, boolean aktifMi){
        super(ad, personelNo, aktifMi);
    }

    public void hastaEkle(Doktor doktor){
        if (doktor.isAktifMi()){
            doktor.hastaEkle();
        }
        else System.out.println("yeni hasta eklenmez çünkü doktor aktif değil.");
    }
    @Override
    public void durumGoster(){
        System.out.println("Sekreter Durumu: " + ad + ", Personel No: " + personelNo + ", Aktif Mi: " + aktifMi);
    }
}
class TestPersonel{
    public static void main(String[] args){
        Doktor doktor1 = new Doktor("Ahmet", 123, true, "Kardiyoloji");
        doktor1.durumGoster();
        doktor1.uzmanlikGoster();
        doktor1.hastaEkle(); // Bir hasta ekleyelim
        doktor1.hastaEkle(); // Bir hasta daha ekleyelim
        System.out.println("Doktor hasta kabul edebilir mi? " + doktor1.hastakabulMU());

        System.out.println("");
    }
}
