package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String gir be");
        String str = scan.nextLine().toLowerCase();

        varMiYokMİ(str);
        System.out.println(varMiYokMİ(str));
    }

    private static boolean varMiYokMİ(String str) {
        if (str.contains("xyz")) {
            return true;
        }
        return false;
    }

}
