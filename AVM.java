public class AVM {
    private static String avmAdi = "Primemall AVM";
    private int MagazaSayisi;

    public AVM(int MagazaSayisi) {
        this.MagazaSayisi = MagazaSayisi;
    }

    class ElektronikMagaza {
        public void hosgeldiniz1() {
            System.out.println("AVM Adı: " + avmAdi);
            System.out.println("Toplam Mağaza Sayısı: " + MagazaSayisi);
        }

        class Teknosa {
            private String magazaAdi = "Teknosa";
            private int katNo = 1;

            public void magazaBilgisi() {
                System.out.println("AVM Adı: " + avmAdi);
                System.out.println("Mağaza kat: " + katNo);
                System.out.println("Mağaza Adı: " + magazaAdi);
            }
        }

        class VatanBilgisayar {
            private String magazaAdi = "Vatan Bilgisayar";
            private int katNo = 2;

            public void magazaBilgisi() {
                System.out.println("AVM Adı: " + avmAdi);
                System.out.println("Mağaza kat: " + katNo);
                System.out.println("Mağaza Adı: " + magazaAdi);
            }
        }

        class Bimeks {
            private String magazaAdi = "Bimeks";
            private int katNo = 3;

            public void magazaBilgisi() {
                System.out.println("AVM Adı: " + avmAdi);
                System.out.println("Mağaza kat: " + katNo);
                System.out.println("Mağaza Adı: " + magazaAdi);
            }
        }
    }

    class YiyecekIcecekMagaza {
        class McDonalds {
            private String magazaAdi = "McDonalds";
            private int katNo = 1;

            public void magazaBilgisi() {
                System.out.println("AVM Adı: " + avmAdi);
                System.out.println("Mağaza kat: " + katNo);
                System.out.println("Mağaza Adı: " + magazaAdi);
            }
        }

        class BurgerKing {
            private String magazaAdi = "Burger King";
            private int katNo = 2;

            public void magazaBilgisi() {
                System.out.println("AVM Adı: " + avmAdi);
                System.out.println("Mağaza kat: " + katNo);
                System.out.println("Mağaza Adı: " + magazaAdi);
            }
        }

        class PizzaHut {
            private String magazaAdi = "Pizza Hut";
            private int katNo = 3;

            public void magazaBilgisi() {
                System.out.println("AVM Adı: " + avmAdi);
                System.out.println("Mağaza kat: " + katNo);
                System.out.println("Mağaza Adı: " + magazaAdi);
            }
        }

    }
    static class CafeDeCafe {
            private static String magazaAdi = "Cafe De Cafe";
            private static int katNo = 4;

            public static void magazaBilgisi() {
                System.out.println("AVM Adı: " + avmAdi);
                System.out.println("Mağaza kat: " + katNo);
                System.out.println("Mağaza Adı: " + magazaAdi);
            }
        }
}
    class test_AVM {
        public static void main(String[] args) {
            AVM avm = new AVM(50);
            AVM.ElektronikMagaza EM = avm.new ElektronikMagaza();
            EM.hosgeldiniz1();

            AVM.ElektronikMagaza.Teknosa teknosa = EM.new Teknosa();
            teknosa.magazaBilgisi();
            AVM.ElektronikMagaza.VatanBilgisayar vatanBilgisayar = EM.new VatanBilgisayar();
            vatanBilgisayar.magazaBilgisi();
            AVM.ElektronikMagaza.Bimeks bimeks = EM.new Bimeks();
            bimeks.magazaBilgisi();
            AVM.YiyecekIcecekMagaza YIM = avm.new YiyecekIcecekMagaza();
            AVM.YiyecekIcecekMagaza.McDonalds mcDonalds = YIM.new McDonalds();
            mcDonalds.magazaBilgisi();
            AVM.YiyecekIcecekMagaza.BurgerKing burgerKing = YIM.new BurgerKing();
            burgerKing.magazaBilgisi();
            AVM.YiyecekIcecekMagaza.PizzaHut pizzaHut = YIM.new PizzaHut();
            pizzaHut.magazaBilgisi();

            // call the static method in a static way (no instance required)
            AVM.CafeDeCafe.magazaBilgisi();
        }
    }
