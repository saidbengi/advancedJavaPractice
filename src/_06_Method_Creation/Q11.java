package _06_Method_Creation;

import java.util.Scanner;

public class Q11 {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
ve cekme, çıkış işlemlerinin yapıldıgı bir
ATM app. method create ediniz
*/
    public static void main(String[] args) {
        atmApp();


    }

    private static void atmApp() {
        System.out.println("Bakiye ogren : 1 \nPara yatirma : 2\nPara cekme : 3\nCikis : 4 rakamlarini tuşlayiniz");
        int rakam = scan.nextInt();
        if (!(rakam > 0 && rakam <= 4)) {
            System.out.println("Dogru rakam tuslayiniz");
        }
        switch (rakam) {
            case 1:
                System.out.println(bakiye);
                break;
            case 2:
                System.out.println("Yatiracaginiz miktari giriniz");
                int parayatırma = scan.nextInt();
                bakiye += parayatırma;
                System.out.println("Yeni bakiyeniz : " + bakiye);
                break;
            case 3:
                System.out.println("Cekeceginiz miktari giriniz");
                int paracekme = scan.nextInt();
                if (paracekme > bakiye) {
                    System.out.println("bakiyeniz yetersiz");
                } else bakiye -= paracekme;
                System.out.println(bakiye);
                break;
            case 4:
                System.out.println("Kartinizi almayı unutmayin");
            default:
                System.out.println("dikkat et bebegim");
        }
    }


}



