public enum Kayak {
    KAR(0.21), TASLİK(0.34), TOPRAK(0.47);

    private final double zorlukSeviyesi;

    Kayak(double zorlukSeviyesi) {
        this.zorlukSeviyesi = zorlukSeviyesi;
    }
    public double hesapla(double m, double alpha){
        double N = m * 9.18 * Math.sin(Math.toRadians(alpha));
        double K = N * zorlukSeviyesi;
        return N-K;
    }
}
class TestKayak {
    public static void main(String[] args){
        double karli = Kayak.KAR.hesapla(60, 30);
        double taslik = Kayak.TASLİK.hesapla(60, 30);
        double toprak = Kayak.TOPRAK.hesapla(60, 30);

        System.out.println("Karlı Zemin Kuvveti: " + karli);
        System.out.println("Taşlık Zemin Kuvveti: " + taslik);
        System.out.println("Toprak Zemin Kuvveti: " + toprak);

    }
}