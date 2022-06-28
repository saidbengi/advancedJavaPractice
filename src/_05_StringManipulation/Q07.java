package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir isim giriniz : ");
        String isim=scan.nextLine().toLowerCase();
        char c1=isim.charAt(0);
        char c2=isim.charAt(1);
        char c3=isim.charAt(2);
        String sonuc=isim.length()==3 ?  ((c1!=c2)&&(c1!=c3)&&(c2!=c3)?"Girdiginiz isim uc harfli ve unique karaktere sahip":
                "Girdiginiz isim uc harfli ve unique karaktere sahip degil"):"Girdiginiz isim uc harfli degil";
        System.out.println(sonuc);




    }
}