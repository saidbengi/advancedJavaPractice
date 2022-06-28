package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num = scan.nextInt();

        for (int i = 0; i < num ; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
