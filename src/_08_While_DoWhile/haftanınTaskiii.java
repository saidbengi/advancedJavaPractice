package _08_While_DoWhile;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Topun kaç m yukseklikten biraktiniz");
        double topYukseklik=scan.nextDouble();
        double alinanYol=0;
        double temp=0;
        int count=0;
        temp=topYukseklik;
        do {
            temp=(3*temp/4);
            alinanYol+=temp;
            count++;
        } while (temp>1);
        System.out.println(alinanYol);
        System.out.println(count);
    }
}
