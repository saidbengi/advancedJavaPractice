package _14_Encapsulation.Q01;

import java.util.Scanner;

public class ArabaMain {
     static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Araba mercedes=new Araba();
        System.out.println("Istediginiz modeli giriniz");
        mercedes.setModel(scan.nextLine());
        System.out.println("Istediginiz rengi giriniz");
        mercedes.setRenk(scan.nextLine());
        System.out.println("Istediginiz model yilini giriniz");
        mercedes.setYil(scan.nextInt());
        System.out.println("Istediginiz motor gucunu giriniz");
        mercedes.setMotor(scan.nextInt());
        System.out.println(mercedes);

        Araba honda=new Araba("Civic","Siyah",1600,2021);
        Araba toyota=new Araba("Corolla","Kirmizi",2000,2023);

        System.out.println("Sectiginiz aracin modeli : "+toyota.getModel()+
                "\nSectiginiz aracin rengi : " +toyota.getRenk()
                +"\nSectiginiz aracin motor gucu : " +toyota.getMotor()+
                "\nSectiginiz aracin yili : " +toyota.getYil());

        Araba tesla=new Araba("Model S","Siyah");









    }
}
