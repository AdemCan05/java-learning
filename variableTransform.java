// Type Conversions in Java (Type Casting and Boxing/Unboxing)

public class variableTransform {
    public static void main(String[] args) {
        
        // ---- Automatic Conversion (Widening Casting) ----
        // Small type -> Large type (happens automatically)
        // int -> float
        /*
        int i_money = 100;
        float f_money = i_money; 
        System.out.println("int to float: " + f_money); // 100.0
        */

        // ---- Manual Conversion (Narrowing Casting) ----
        // Large type -> Small type (must be done manually)
        // float -> int
        /*
        float f_money = 100.99f;
        int i_money = (int) f_money; // decimal part is lost
        System.out.println("float to int: " + i_money); // 100
        */

        // ---- Autoboxing and Unboxing ----
        // primitive type -> wrapper class (autoboxing)
        // wrapper class -> primitive type (unboxing)

        Integer i_money = 100;                 // int → Integer (autoboxing)
        Double d_money = i_money.doubleValue(); // Integer → double (unboxing)
        
        System.out.println("Integer money as Double: " + d_money);
    }
}
