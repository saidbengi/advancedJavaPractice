package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String word=scan.next();
        String halfword=word.substring(0,word.length()/2);
        System.out.println(halfword);
    }
}
