package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir str gir");
        String str = scan.nextLine();
        int count = 0;
        String c = "c";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='c') {
                break;
            }
            if (str.charAt(i) == 'a') {
                    count++;
                }
        }
        System.out.println("a harfi : "+count);
    }
}
