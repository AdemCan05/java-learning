public class GenericTurler<T, G>{
    T degisken;
    G obje;

    public void goster(){

    }
    public T getDegisken(){
        return this.degisken;
    }
    public void setDegisken(T degisken, G obje){
        this.degisken = degisken;
        this.obje = obje;
    }
}
class Sinifim<T>{
    T deger;

}

class TestGenericTurler{
    public static void main(String[] args){
        GenericTurler<String, Integer> genericTurler = new GenericTurler<String, Integer>();
        genericTurler.setDegisken("adolf", 25);
        System.out.println("Degisken Değeri: " + genericTurler.getDegisken() + " Obje Değeri: " + genericTurler.obje);
        // Tipler non-primitive (sınıf) olmak zorundadır.(Float, Integer, Double vs. kullanılabilir)
    }
}