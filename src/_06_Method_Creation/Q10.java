package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {

    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        // carpim *= 3; bu trick haberin olsun

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();
        powerOfThree(sayi);
        System.out.println(powerOfThree(sayi));
    }

    private static boolean powerOfThree(int sayi) {
        boolean katiMi = false;
        int carpim = 1;
        for (int i = 0; i < sayi; i++) {
            carpim *= 3;

            if (carpim == sayi) {
                katiMi = true;
                break;
            }

        }
        return katiMi;
    }


}
