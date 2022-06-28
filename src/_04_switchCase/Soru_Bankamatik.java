package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATM ye hosgeldiniz");
        System.out.println("Bakiye sorgulama : 1 \nPara cekme : 2\nPara yatirma : 3" +
                "\nCıkıs : 4 \nYapacaginiz islemi seciniz");
        int islem = scanner.nextInt();
        double bakiye=1000;

        switch(islem){

            case 1 :
                System.out.print("Mevcut bakiyeniz : " + bakiye );
                break;
            case 2 :
                System.out.print("Cekeceginiz miktari giriniz : ");
                int cekilenMiktar = scanner.nextInt();
                if (cekilenMiktar>bakiye){
                    System.out.println("Bakiye yetersiz");
                }else {
                    bakiye-=cekilenMiktar;
                    System.out.print("Bakiyeniz guncel hali : " + bakiye);
                }
                break;
            case 3 :
                System.out.print("Yatiracaginiz miktari giriniz : ");
                int yatirilanMiktar = scanner.nextInt();
                bakiye+=yatirilanMiktar;
                System.out.println("Bakiyeniz guncel hali : " + bakiye);
                break;
            case 4 :
                System.out.print("Cikisiniz yapilmistir\nYine bekleriz");
                break;






        }


    }
}

