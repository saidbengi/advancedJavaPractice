package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1.isminizi giriniz : ");
        String isim= scan.nextLine().toUpperCase();
        System.out.print("Lutfen 2.isminizi giriniz : ");
        String isim2= scan.nextLine().toUpperCase();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyisim= scan.nextLine().toUpperCase();

        System.out.println(isim.charAt(0)+"."+ isim2.charAt(0)+"."+soyisim.charAt(0));
    }
}
