package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("IT alan bilgisi giriniz");
		String alanBilgisi = scan.next();

		switch(alanBilgisi){

			case "qa":
				System.out.println("Mesleginiz Quality Analyst");
				break;
			case "dev":
				System.out.println("Mesleginiz Developer");
				break;
			case "ba":
				System.out.println("Mesleginiz Busines Analyst");
				break;
			case "pm":
				System.out.println("Mesleginiz Project Manager");
			default:
				System.out.println("IT alanini kontrol edin");
		}


	}

}
