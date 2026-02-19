abstract class Fatura {
    protected String kullaniciTipi;
    protected double ucret;

    public Fatura(String kullaniciTipi){
        this.kullaniciTipi = kullaniciTipi;
    }

    public abstract void Hesapla();

    public void print() {
        System.out.println(getClass().getSimpleName() + " (" + kullaniciTipi + ") : " + ucret + " TL");
    }
}


// -------------------  CHATBOT  --------------------

abstract class ChatBot extends Fatura {
    protected int soruSayisi;
    protected double aktifSure;

    public ChatBot(String kullaniciTipi, int soruSayisi, double aktifSure){
        super(kullaniciTipi);
        this.soruSayisi = soruSayisi;
        this.aktifSure = aktifSure;
    }
}

class ChatGPT extends ChatBot {
    public ChatGPT(String kullaniciTipi, int soruSayisi, double aktifSure){
        super(kullaniciTipi, soruSayisi, aktifSure);
    }

    @Override
    public void Hesapla(){
        ucret = 140.55 + (soruSayisi * 2.15) + (aktifSure * 0.45);

        if (kullaniciTipi.equalsIgnoreCase("Öğrenci")){
            ucret *= 0.85;  // %15 indirim
        }
    }
}

class Gemini extends ChatBot {
    public Gemini(String kullaniciTipi, int soruSayisi, double aktifSure){
        super(kullaniciTipi, soruSayisi, aktifSure);
    }

    @Override
    public void Hesapla(){
        ucret = 105.33 + (soruSayisi * 3.84) + (aktifSure * 0.11);

        if (kullaniciTipi.equalsIgnoreCase("Kurumsal")){
            ucret *= 1.15; // %15 vergi
        }
    }
}


// -------------------  PLATFORM  --------------------

abstract class Platform extends Fatura {
    protected double abonmanSuresi;
    protected double onlineSure;

    public Platform(String kullaniciTipi, double abonmanSuresi, double onlineSure){
        super(kullaniciTipi);
        this.abonmanSuresi = abonmanSuresi;
        this.onlineSure = onlineSure;
    }
}

class Digiturk extends Platform {
    public Digiturk(String kullaniciTipi, double abonmanSuresi, double onlineSure){
        super(kullaniciTipi, abonmanSuresi, onlineSure);
    }

    @Override
    public void Hesapla(){
        double extra = ((onlineSure - abonmanSuresi) / abonmanSuresi) * 100;

        if (extra >= 11 && extra <= 20){
            ucret = 150;
        }
        else if (extra >= 21 && extra <= 50){
            ucret = 350 * 1.13;
        }
    }
}

class Netflix extends Platform {
    public Netflix(String kullaniciTipi, double abonmanSuresi, double onlineSure){
        super(kullaniciTipi, abonmanSuresi, onlineSure);
    }

    @Override
    public void Hesapla(){
        double extra = ((onlineSure - abonmanSuresi) / abonmanSuresi) * 100;

        if (extra >= 9 && extra <= 35){
            ucret = 420;
        }
        else if (extra >= 51 && extra <= 80){
            ucret = 1400;
        }
    }
}


// -------------------  MAIN  --------------------

public class FinalCevap {
    public static void main(String[] args){
        
        Digiturk d1 = new Digiturk("Bireysel", 100, 140);
        d1.Hesapla();
        d1.print();

        ChatGPT c1 = new ChatGPT("Öğrenci", 5, 5);
        c1.Hesapla();
        c1.print();

        Netflix n1 = new Netflix("Bireysel", 100, 170);
        n1.Hesapla();
        n1.print();

        Gemini g1 = new Gemini("Kurumsal", 10, 50);
        g1.Hesapla();
        g1.print();
    }
}
