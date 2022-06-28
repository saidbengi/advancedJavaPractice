package _07_ForLoop;

import java.util.Scanner;

public class Q11 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int num = scan.nextInt();


        mukemmelSayi(num);
        if (mukemmelSayi(num)) {
            System.out.println("Sayiniz mukemmel sayidir");
        } else {
            System.out.println("Sayiniz bok gibi bir sayi");
        }

    }


    private static boolean mukemmelSayi(int num) {
        boolean mukemmel = false;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
            if (num == sum) {
                mukemmel = true;
            }
        }
        return mukemmel;
    }


}
