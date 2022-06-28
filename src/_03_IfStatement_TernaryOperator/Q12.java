package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */

        int vize = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen vize notunuzu giriniz : ");
        boolean error = true;
        while (error) {
            vize = scan.nextInt();
            if (vize > 0 && vize <= 100) {
                error = false;
            } else {
                System.out.println("Gecerli bir sayi giriniz");
                System.out.print("Lutfen vize notunuzu giriniz : ");
                error = true;
            }
        }


        System.out.print("Vize oran : ");
        double vizeoran = scan.nextInt();
        if (vizeoran > 0 && vizeoran <= 100) {
        } else System.out.println("Gecerli bir sayi giriniz");

        System.out.print("Lutfen final notunuzu giriniz : ");
        int fnal = scan.nextInt();
        if (fnal > 0 && fnal <= 100) {
        } else System.out.println("Gecerli bir sayi giriniz");

        System.out.print("Final oran : ");
        double fnaloran = scan.nextInt();
        if (fnaloran > 0 && fnaloran <= 100) {
        } else System.out.println("Gecerli bir sayi giriniz");

        double notort = (double) (vize * vizeoran / 100) + (fnal * fnaloran / 100);
        System.out.println("Not ortalamaniz : " + notort);

        if (notort >= 50) {
            System.out.println("Tebrikler dersi başarı ile geçtiniz...");
        } else System.out.println("Malesef dersten kaldınız...");


    }
}
