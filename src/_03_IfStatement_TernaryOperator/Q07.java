package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char harf=scan.next().charAt(0);

		if (harf>'A' && harf<'Z'){
			System.out.println("Buyuk harf girdiniz");
		}else if (harf>'a' && harf<'z'){
			System.out.println("Kucuk harf girdiniz");
		}else {
			System.out.println("Yanlış karakter girdiniz");
		}



	}

}
