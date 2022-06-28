package Projects.P05_HalukMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalukMarket {
    static double sepet = 0;
    static Scanner scan = new Scanner(System.in);

    public static double secim(List fiyat) {


        return sepet;
    }

    public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */
        System.out.println(" ***** Markete hosgeldiniz *****");
        market();
        System.out.println("Alis-Verise devam etmek istiyorsanız 1 e tıklayiniz odemeye gecmek istiyorsaniz 2 tuslayiniz");
        int devam = scan.nextInt();
        boolean dongu = true;
        while (dongu==false) {
            if (devam == 1) {
                devamEtmek();
                dongu = true;
            } else {
                dongu = false;
            }
        }
        System.out.println("Alis veris tutariniz : " + sepet);
        System.out.println("Yine bekleriz");


    }

    private static void devamEtmek() {
        market();
    }

    private static double market() {
        List<String> market = new ArrayList<>();
        market.add("Domates");
        market.add("Patates");
        market.add("Biber");
        market.add("Soğan");
        market.add("Havuç");
        market.add("Elma");
        market.add("Muz");
        market.add("Çilek");
        market.add("Kavun");
        market.add("Üzüm");
        market.add("Limon");
        List<Double> fiyat = new ArrayList<>();
        fiyat.add(2.1);
        fiyat.add(3.2);
        fiyat.add(1.5);
        fiyat.add(2.3);
        fiyat.add(3.1);
        fiyat.add(1.2);
        fiyat.add(1.9);
        fiyat.add(6.1);
        fiyat.add(4.3);
        fiyat.add(2.7);
        fiyat.add(0.5);

        System.out.println("\tNo\t  Ürün\t\t\t Fiyat\n" +
                "\t==== =======\t \t=========\n" +
                "\t0\t Domates   \t \t 2.10 TL\n" +
                "\t1\t Patates   \t \t 3.20 TL\n" +
                "\t2\t Biber     \t \t 1.50 TL\n" +
                "\t3\t Soğan      \t 2.30 TL\n" +
                "\t4\t Havuç     \t   \t 3.10 TL\n" +
                "\t5\t Elma      \t   \t 1.20 TL\n" +
                "\t6\t Muz     \t \t 1.90 TL\n" +
                "\t7\t Çilek \t \t\t 6.10 TL\n" +
                "\t8\t Kavun      \t 4.30 TL\n" +
                "\t9\t Üzüm      \t \t 2.70 TL\n" +
                "\t10\t Limon     \t \t 0.50 TL");
        System.out.println("Listede ki urun no suna gore seciminizi yapiniz");

        int no = scan.nextInt();
        System.out.println("Kac kilo alicaksiniz");
        double kilo = scan.nextDouble();
        if (no == 0) {
            sepet += kilo * fiyat.get(0);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 1) {
            sepet += kilo * fiyat.get(1);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 2) {
            sepet += kilo * fiyat.get(2);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 3) {
            sepet += kilo * fiyat.get(3);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 4) {
            sepet += kilo * fiyat.get(4);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 5) {
            sepet += kilo * fiyat.get(5);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 6) {
            sepet += kilo * fiyat.get(6);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 7) {
            sepet += kilo * fiyat.get(7);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 8) {
            sepet += kilo * fiyat.get(8);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 9) {
            sepet += kilo * fiyat.get(9);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        } else if (no == 10) {
            sepet += kilo * fiyat.get(10);
            System.out.println("Sepetinizin tutarı : " + sepet + " TL");
        }
        return sepet;
    }
}
