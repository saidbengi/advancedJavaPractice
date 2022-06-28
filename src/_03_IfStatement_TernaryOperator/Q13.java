package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ucgen olusturulabilicek 3 adet sayi giriniz");
        int sayi1, sayi2, sayi3;
        System.out.print("Birinci kenar :");
        sayi1 = scan.nextInt();
        System.out.print("İkinci kenar :");
        sayi2 = scan.nextInt();
        System.out.print("Ucuncu kenar :");
        sayi3 = scan.nextInt();

        if ((sayi3 * sayi3 == (sayi2 * sayi2) + (sayi1 * sayi1))) {
            System.out.println("Bu bir dik ucgendir");
        } else if ((sayi1 * sayi1 == (sayi2 * sayi2) + (sayi3 * sayi3))) {
            System.out.println("Bu bir dik ucgendir");
        } else if ((sayi2 * sayi2 == (sayi1 * sayi1) + (sayi3 * sayi3))) {
            System.out.println("Bu bir dik ucgendir");
        } else System.out.println("Siradan bir ucgen yazikkk");


    }
}
