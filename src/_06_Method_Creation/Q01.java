package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

/* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime girin");
        String word = scan.next().toLowerCase();

        returnEdenKelime(word);


    }

    private static String returnEdenKelime(String word) {
        if (word.substring(0, 2).equals("gh")) {
            System.out.println(word);
        } else if (word.startsWith("g")) {
            System.out.println("g" + word.substring(2));
        } else if (word.charAt(1) == 'h') {
            System.out.println("h" + word.substring(2));
        } else {
            System.out.println(word.substring(2));
        }
        return word;
    }
}



