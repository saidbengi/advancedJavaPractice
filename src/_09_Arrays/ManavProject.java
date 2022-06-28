package _09_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProject {
    static Scanner scan =new Scanner(System.in);
    static List<String> urunList = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static double toplamOdeme;

    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        urunList.add("domates -urun kodu: 1");
        urunList.add("muz -urun kodu: 2");
        urunList.add("elma -urun kodu: 3");
        urunList.add("erik -urun kodu: 4");
        urunList.add("cilek -urun kodu: 5");
        System.out.println(urunList);

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);
        musteriSecim();



    }

    private static void musteriSecim() {
        System.out.print("Sectiginiz urun kodu giriniz : ");
        int secim=scan.nextInt();
        System.out.print("Sectiginiz urunden kac kilo alicaksiniz : ");
        double kilo=scan.nextDouble();
        double uruntutar=kilo*urunFiyatlari.get(secim-1);
        toplamOdeme+=uruntutar;
        System.out.println("Toplam tutar : "+toplamOdeme);
        System.out.println("Alıs-verise devam etmek istiyorsaniz 1 odeme icin 2 seciniz");
        int secim2=scan.nextInt();
        if (secim2==1){
            musteriSecim();
        }else {
            kasa();
        }
    }

    private static void kasa() {
        System.out.println("Yine bekleriz\n"+"Toplam tutar : "+toplamOdeme);
    }
}
