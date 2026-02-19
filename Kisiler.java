import java.util.ArrayList;
public class Kisiler{
    private String ad;
    private int yas;

    public Kisiler(String ad, int yas){
        this.ad = ad;
        this.yas = yas;
    }
    public void bilgiYaz(){
        System.out.println("Sayin " + ad + ",Yaşınız: "+ yas);
    } 
}


class Main{
        public static void main(String[] args){
            Kisiler k1 = new Kisiler("Adem", 20);
            Kisiler k2 = new Kisiler("Melisa", 25);
            Kisiler k3 = new Kisiler("Yusuf", 28);

            ArrayList<Kisiler> kisiler = new ArrayList<>();
            kisiler.add(k1);
            kisiler.add(k2);
            kisiler.add(k3);

            for (Kisiler k: kisiler){
                k.bilgiYaz();
            }

        }
}