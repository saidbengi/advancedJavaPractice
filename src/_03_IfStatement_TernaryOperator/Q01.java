package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);//kullanicidan input almak icin scanner obj create ettik
		System.out.println(" toplama için 1\n çikarma için 2\n bolem için 3\n çarpma için 4");//
		//kullaniciye secim icin islem menusu yazdirdik
		int islem=scan.nextInt();
		System.out.println("Lutfen iki tam sayi giriniz");//kullaniciye bildirimde bulunuldu
		double num1=scan.nextDouble();//1 sayi assign edildi
		double num2=scan.nextDouble();//2 sayi assign edildi

		if (islem==1){
			System.out.println("Toplama islemenin sonucu:"+num1+" + "+ num2 + " = " + (num1+num2));
		}else if (islem==2){
			System.out.println("Cikarma islemenin sonucu:"+num1+" - "+ num2 + " = " + (num1-num2));
		}else if (islem==3){
			System.out.println("Bolme islemenin sonucu:"+num1+" / "+ num2 + " = " + (num1/num2));
		}else if (islem==4){
			System.out.println("Carpma islemenin sonucu:"+num1+" * "+ num2 + " = " + (num1*num2));
		}else {
			System.out.println("Hatali secim yaptınız tekrar deneyiniz");
		}






	}

}
