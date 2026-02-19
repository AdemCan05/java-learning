interface wifiBaglanable {
    void wifiBaglan();
}

public abstract class SmartHome {
    private int cihazID;
    private String bulunduguOda;

    public SmartHome(int cihazID, String bulunduguOda) {
        this.cihazID = cihazID;
        this.bulunduguOda = bulunduguOda;
    }
    public abstract void calistir();

    public abstract void durdur();

    public void durumRaporu(String durum){
        System.out.println("CihazID: " + cihazID + ", Oda: " + bulunduguOda + ", Durum: " + durum);
    }
}

class Lamba extends SmartHome implements wifiBaglanable {
    public Lamba(int cihazID, String bulunduguOda) {
        super(cihazID, bulunduguOda);
    }
    @Override
    public void calistir() {
        System.out.println("Lamba açıldı.");
    }
    @Override
    public void durdur() {
        System.out.println("Lamba kapandı.");
    }
    @Override
    public void wifiBaglan() {
        System.out.println("Lamba WiFi'ye bağlandı.");
    }
}

class SecurityCamera extends SmartHome implements wifiBaglanable {
    public SecurityCamera(int cihazID, String bulunduguOda) {
        super(cihazID, bulunduguOda);
    }
    @Override
    public void calistir() {
        System.out.println("Kamera açıldı.");
    }
    @Override
    public void durdur() {
        System.out.println("Kamera kapandı.");
    }
    @Override
    public void wifiBaglan() {
        System.out.println("Kamera WiFi'ye bağlandı.");
    }
}

class Termostat extends SmartHome {
    public Termostat(int cihazID, String bulunduguOda) {
        super(cihazID, bulunduguOda);
    }
    @Override
    public void calistir() {
        System.out.println("Termostat açıldı.");
    }
    @Override
    public void durdur() {
        System.out.println("Termostat kapandı.");
    }
    @Override
    public void durumRaporu(String durum) {
        System.out.println("Termostat durumu: " + durum);
    }
class HomeDev{
    public static void main(String[] args) {
        Lamba lamba = new Lamba(1, "Oturma Odası");
        lamba.calistir();
        lamba.durumRaporu("Açık");
        lamba.wifiBaglan();
        lamba.durdur();

        SecurityCamera kamera = new SecurityCamera(2, "Bahçe");
        kamera.calistir();
        kamera.durumRaporu("Aktif");
        kamera.wifiBaglan();
        kamera.durdur();

        Termostat termostat = new Termostat(3, "Yatak Odası");
        termostat.calistir();
        termostat.durumRaporu("22°C");
        termostat.durdur();
    }
}
}