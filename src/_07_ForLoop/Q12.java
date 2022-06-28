package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("1 den buyuk tamsayi giriniz");
        int num = scan.nextInt();
        if (!(num>1)){
            System.out.println("1 den buyuk bir sayi gir dedik ya ");
        }

        int sum = 0;
        for (int i = 2; i < num; i++) {
           sum+=i*i;
        }

        System.out.println(sum);
    }
}
