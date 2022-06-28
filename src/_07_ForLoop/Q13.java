package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String str= scan.nextLine().toLowerCase();
		System.out.println("Bir harf giriniz");
		char harf=scan.next().charAt(0);

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == harf){
				sum++;
			}
		}
		System.out.println(harf+" harfiniz cumlede "+sum+" kere kullanilmis");

	}

}
