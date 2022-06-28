package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Lütfen sayi giriniz");
            int sayi = scan.nextInt();
            if (!(sayi > 5 && sayi < 10)) {
                sum += sayi;
            }
        }

        System.out.println(sum);
    }

}
