package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir str giriniz");
        String str=scan.nextLine();
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);
        }
        if (str.equals(tersStr)){
            System.out.println("Str'iniz palindromdur");
        }else System.out.println("Str'iniz palindrom degildir");

    }

}

