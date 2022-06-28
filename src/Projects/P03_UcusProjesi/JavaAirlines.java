package Projects.P03_UcusProjesi;

import java.util.Scanner;

import static Projects.P03_UcusProjesi.UcusConstructor.*;

public class JavaAirlines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("******* Hoşgeldiniz *******");
        double kmFiyat = 0.1;
        double bKmFiyat=kmFiyat*500;
        double cKmFiyat=kmFiyat*700;
        double dKmFiyat=kmFiyat*900;

        System.out.println("Hangi şehre uçmak istersiniz \nB sehri icin -> b\nC sehri icin -> c \nD sehri icin -> d \nTuslayiniz ");
        String rota = scan.next().toUpperCase();
        System.out.println("Yasinizi giriniz");
        int age = scan.nextInt();
        double price = 0;
        System.out.println("Biletinizi gidis-donus alirsaniz %20 indirim uygulunacaktir");
        System.out.println("Gidis-donus icin -> 1  tek bilet icin -> 2 \nTuslayiniz");
        int tickets = scan.nextInt();
        if (!(tickets <= 2 && tickets != 0)) {
            System.out.println("Yanlis tusladiniz bileti gidis-donus alicaksaniz -> 1\ntek bilet alıcaksaniz -> 2 tuslayiniz");
        }
        tercihBSehri(bKmFiyat,rota,age,price,tickets);
        tercihCSehri(cKmFiyat,rota,age,price,tickets);
        tercihDSehri(dKmFiyat,rota,age,price,tickets);


        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }


}