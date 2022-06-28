package _06_Method_Creation;

import java.util.Scanner;

public class Q07 {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Str bir ifade git");
        String str= scan.nextLine();
        reverseString(str);
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String str2="";
        for (int i = str.length()-1; i >=0 ; i--) {
            str2+=str.charAt(i);

        }
        return str2;
    }

}
