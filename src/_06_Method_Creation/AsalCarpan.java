package _06_Method_Creation;

import java.util.Scanner;

public class AsalCarpan {
    static int bolen = 0;
    static boolean isAsal = true;


    public static void main(String[] args) {
        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int num1 = scan.nextInt();
        asalCarpan(num1);



    }

    private static void asalCarpan(int num1) {
        int asalBolen = 0;
        for (int i = 2; i <= num1; i++) {
            if (num1 % i == 0) {
                bolen = i;
                asalMi(bolen);
            }
            if (isAsal) {
                asalBolen = bolen;
            }

        }
        System.out.print("En buyuk asal bolen : " + asalBolen);
    }

    private static boolean asalMi(int bolen) {
        for (int i = 2; i < bolen; i++) {
            if (bolen % i != 0) { // bolen sayisini bolen sayisina kadar tum tamsayilar boldugunde kalan 0 degilse:
                // bu sayi kendisinden baska hicbir sayiya bolunmez
                isAsal = true;
            }else{
                isAsal = false;
                break;
            }
        }
        return isAsal;
    }


}


