package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tarihi gun,ay,yıl olarak giriniz");
        System.out.print("Gun : ");
        int gun = scan.nextInt();

        if (gun > 0 && gun <= 31) {
        } else System.out.println("Yanlıs giris yaptiniz");

        System.out.print("Ay : ");
        int ay = scan.nextInt();
        if (ay > 0 && ay <= 12) {
        }else System.out.println("Yanlıs giris yaptiniz");


        System.out.print("Yil : ");
        int yil = scan.nextInt();
        if (yil > 1900 && yil <= 2022) {
        } else System.out.println("Yanlıs giris yaptiniz");
        System.out.println(ay + "." + gun + "." + yil);
        System.out.println(yil + "." + ay + "." + gun);


    }
}
