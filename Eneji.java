public class Eneji {

    class TSE {

        public void display(){
            System.out.println("This is TSE class inside Eneji class.");

            // Local class 1
            class ASE {
                public void show(){
                    System.out.println("This is ASE class inside display() method.");
                }
            }

            // Local class 2
            class CSE {
                public void print(){
                    System.out.println("This is CSE class inside display() method.");
                }
            }

            // Local class nesneleri
            ASE ase = new ASE();
            ase.show();

            CSE cse = new CSE();
            cse.print();
        }
    }

    // Static nested class DOĞRU yerde burada olmalı
    static class ECE {
        void info(){
            System.out.println("This is ECE static class inside Eneji class.");
        }
    }
}
class Mainimmm{
    public static void main(String[] args){
        Eneji eneji = new Eneji();
        Eneji.TSE tse = eneji.new TSE();
        tse.display();
        // inside display() method, local classes ASE and CSE are instantiated and their methods are called.


        Eneji.ECE ece = new Eneji.ECE();
        ece.info();
    }
}