public class veriable_transform{
    public static void main(String[] args){
        /*int i_money = 100;
        float d_money = i_money; */ // bigger to smaller sadece bu şekilde dönüşüm olur

        /*float d_money = 100.99f;
        int i_money = (int) d_money; // smaller to bigger dönüştürme (casting) */

        Integer i_money = 100; // int to Integer (autoboxing)
        Double d_money = i_money.doubleValue(); // Integer to double (unboxing)
        System.out.println("Integer money: " + d_money);
    }
}