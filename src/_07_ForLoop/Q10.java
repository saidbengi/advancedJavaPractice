package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Bir harf giriniz");
            String harf = scan.next().toLowerCase();

            if (!(harf.charAt(0) >= 'a' && harf.charAt(0) <= 'z')) {
                System.out.println("Lutfen harf girin");
            }
            if (!(harf.length() <= 1)) {
                System.out.println("1 tane harf girmeni istedim sadece");
            }

            String sesliHarf = "a,e,i,o,u";

            for (int i = 0; i < sesliHarf.length(); i++) {
                if (sesliHarf.contains(harf)) {
                    System.out.println(harf + " Harfi sesli harftir");
                    break;
                } else {
                    System.out.println(harf + " Harfi sessiz harftir");
                    break;
                }
            }
    }
}


