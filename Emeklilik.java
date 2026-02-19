// Ana Sınıf
class EYT {
    protected String ucretRolu;
    protected String emeklilikRolu;
    protected int yas;
    protected int girisYili;

    public EYT(String ucretRolu, String emeklilikRolu, int yas, int girisYili) {
        this.ucretRolu = ucretRolu;
        this.emeklilikRolu = emeklilikRolu;
        this.yas = yas;
        this.girisYili = girisYili;
    }
        public EYT(String ucretRolu, String emeklilikRolu) {
        this.ucretRolu = ucretRolu;
        this.emeklilikRolu = emeklilikRolu;
        this.yas = 0;
        this.girisYili = 0;
}


interface Emeklilik {
    abstract void Sorgula(int calismaSuresi, String meslek);
}


class Kadin extends EYT implements Emeklilik {
    
    
    public Kadin(String ucretRolu, String emeklilikRolu, int yas, int girisYili) {
        super(ucretRolu, emeklilikRolu, yas, girisYili);
    }

    @Override
    public void Sorgula(int calismaSuresi, String meslek) {
        
        int mevcutYil = 2026;
        int sgkGecenSure = mevcutYil - girisYili;
        
        
        double hesaplananSure = calismaSuresi;

        
        if (meslek.equals("4A")) {
            hesaplananSure = calismaSuresi * 1.15;
        } 

        if (hesaplananSure > 5000 && sgkGecenSure > 20) {
            System.out.println("Tebrikler, Kadın çalışan olarak emekli oldunuz!");
        } else {
            System.out.println("Emeklilik şartları sağlanamadı.");
        }
    }
}

class Erkek extends EYT implements Emeklilik{
    public Erkek(String ucretRolu, String emeklilikRolu, int yas, int girisYili) {
        super(ucretRolu, emeklilikRolu, yas, girisYili);
    }

    @Override
    public void Sorgula(int calismaSuresi, String meslek) {
        int mevcutYil = 2026;
        int sgkGecenSure = mevcutYil - girisYili;
        double hesaplananSure = calismaSuresi;

        if(meslek.equals("4A")){
            hesaplananSure = calismaSuresi * 1.20;
        }
        else if(meslek.equals("4B") || meslek.equals("4C")){
            hesaplananSure = calismaSuresi * 1.07;
        }

        if (hesaplananSure > 5500 && sgkGecenSure > 25) {
            System.out.println("Tebrikler, Erkek çalışan olarak emekli oldunuz");
        }
        else{
            System.out.println("Emeklilik şartları sağlanamadı.");
        }
    
        }
}

interface Ucret {
    void setMaas(int primGunu, double primTL);
    
}
class ISCI extends EYT implements Ucret {

    public ISCI(String ucretRolu, String emeklilikRolu, int yas, int girisYili) {
        super(ucretRolu, emeklilikRolu, yas, girisYili);
    }
    @Override
    public void setMaas(int primGunu, double primTL) {
        double maas = 0;
        double altlimit1 = 5000 * 1.11;
        double ustlimit1 = 5000 * 1.20;
        double altlimit2 = 5000 * 1.21;
        double ustlimit2 = 5000 * 1.50;

        if (primGunu >= altlimit1 && primGunu <= ustlimit1) {
            maas = 5000 * 1.11;
            System.out.println("Maaş: " + maas + " TL");
        } else if (primGunu >= altlimit2 && primGunu <= ustlimit2) {
            maas = 6750 * 1.13;
            System.out.println("Maaş: " + maas + " TL");
        }
    }
}

class Memur extends EYT implements Ucret {
    public Memur(String ucretRolu, String emeklilikRolu, int yas, int girisYili) {
        super(ucretRolu, emeklilikRolu, yas, girisYili);
    }
    @Override
    public void setMaas(int primGunu, double primTL) {
        double maas = 0;
        double altlimit1 = 5200 * 1.11;
        double ustlimit1 = 5200 * 1.2;

        double altlimit2 = 5200 * 1.21;
        double ustlimit2 = 5200 * 1.50;

        if (primGunu >= altlimit1 && primGunu <= ustlimit1) {
            maas = 7500 * 0.97;
            System.out.println("Maaş: " + maas + " TL");
        }
        else if (primGunu >= altlimit2 && primGunu <= ustlimit2) {
            maas = 8300 * 0.94;
            System.out.println("Maaş: " + maas + " TL");
        }
    }

}
}
