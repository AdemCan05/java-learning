// Java'da Tip Dönüşümleri (Type Casting ve Boxing/Unboxing)

public class variable_transform {
    public static void main(String[] args) {
        
        // ---- Otomatik Dönüşüm (Widening Casting) ----
        // Küçük tip -> Büyük tip (otomatik olur)
        // int -> float
        /*
        int i_money = 100;
        float d_money = i_money; 
        System.out.println("int to float: " + d_money); // 100.0
        */

        // ---- Manuel Dönüşüm (Narrowing Casting) ----
        // Büyük tip -> Küçük tip (manuel yapılır)
        // float -> int
        /*
        float d_money = 100.99f;
        int i_money = (int) d_money; // ondalık kısım kaybolur
        System.out.println("float to int: " + i_money); // 100
        */

        // ---- Autoboxing ve Unboxing ----
        // ilkel tip -> wrapper sınıfı (autoboxing)
        // wrapper sınıfı -> ilkel tip (unboxing)

        Integer i_money = 100;                 // int → Integer (autoboxing)
        Double d_money = i_money.doubleValue();// Integer → double (unboxing)
        
        System.out.println("Integer money as Double: " + d_money);
    }
}
