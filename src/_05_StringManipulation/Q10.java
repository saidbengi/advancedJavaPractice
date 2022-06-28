package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name = scan.nextLine().toUpperCase();
        System.out.println("lutfen soyadinizi giriniz");
        String lastname = scan.nextLine().toUpperCase();
        System.out.println("Kredi karti no giriniz");
        String kKNo=scan.nextLine();
        if (kKNo.length()<16){
            System.out.println("Gecersiz kredi karti no");
        }
        String name2=name.substring(0,1)+name.substring(1).replaceAll("\\S","*");
        String lastname2=lastname.substring(0,1)+lastname.substring(1).replaceAll("\\S","*");
        String kKNo2="**** **** ****"+ kKNo.substring(12);

        System.out.print("Ad : "+name2+" Soyad : "+lastname2+ " kartno : "+kKNo2 );




    }
}
