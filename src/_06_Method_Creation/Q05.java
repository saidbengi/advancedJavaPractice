package _06_Method_Creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir str gir be");
        String str = scan.nextLine();
        int sonuc =kacKelime(str);
        System.out.println(sonuc);

    }

    private static int kacKelime(String str) {
        String str2[] = new String[str.length()];
        str2 = str.split(" ");
        return str2.length;
    }
}
