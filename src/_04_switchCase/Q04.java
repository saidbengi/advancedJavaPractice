package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Kullanicinin yasadigi gune göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta baslangici

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pazartesi: 1 \nSali: 2 \nCarsamba: 3 \nPersembe: 4 \nCuma: 5 " +
                "\nCumartesi: 6 \nPazar: 7\nHaftanin kacinci gununde oldugunu giriniz : ");
        int kacıncıGun = scanner.nextInt();


        if (kacıncıGun <= 0 || kacıncıGun > 7){
            System.out.println("hatali sayi girdiniz");
        }else
            System.out.print("Kac gun sonrasini ogrenmek istiyorsunuz : ");
        int kacGunSonrasi = scanner.nextInt();
        int bulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden SALİ");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra gunlerden PAZAR");
                    break;
                default:
                    System.out.println("Hafta 7 gun istenilen sayiyi giriniz");
            }



    }
}

