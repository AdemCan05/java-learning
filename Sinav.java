abstract class Sinav {
    abstract void maasHesapla();
}
class AkademikPersone extends Sinav{
    @Override
    void maasHesapla() {
        System.out.println("Akademik Personel Maaşı: 5000 TL");
    }
}
class IdariPersone extends Sinav{
    @Override
    void maasHesapla() {
        System.out.println("İdari Personel Maaşı: 4000 TL");
    }
}
class TestSinav{
    public static void main(String[] args){
        Sinav akademikPersone = new AkademikPersone();
        akademikPersone.maasHesapla();
        Sinav idariPersone = new IdariPersone();
        idariPersone.maasHesapla();
    }
}
