package _05_StringManipulation;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String mail=scan.nextLine();
        if (!mail.contains("@")){
            System.out.println("gecerli bir mail giriniz");
        }else if (mail.contains("gmail.com")){
            System.out.println("mail onaylandi");
        }else {
            System.out.println("Lutfen gmail hesabinizi giriniz");
        }
    }

}
