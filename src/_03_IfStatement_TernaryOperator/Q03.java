package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  M  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu m giriniz : ");
        double boy= scanner.nextDouble();
        System.out.println("Kilonuzu kg giriniz : ");
        double kilo=scanner.nextDouble();
        double bmi=kilo/((boy/100)*(boy/100));

        if (bmi<=20){
            System.out.println("oldukca zayifsiniz");
        }else if (20<bmi&&bmi<=25){
            System.out.println("Normal sinirlardasiniz");
        }else if (25<bmi&&bmi<=30){
            System.out.println("Sisman kategorisindesiniz");
        }else if (30<bmi){
            System.out.println("Obez grubundasiniz");
        }else {
            System.out.println("Dogru degerler giriniz");
        }


    }

}
