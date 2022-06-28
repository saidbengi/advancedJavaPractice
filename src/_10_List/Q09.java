package _10_List;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran
         code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir str giriniz : ");
        String arr[] = scan.nextLine().replaceAll(" ","").split("");
        String maxTekrarharf = "";
        int sayac = 0;
        int maxSayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    sayac++;
                }

            }
            if (sayac > maxSayac) {
                maxSayac = sayac;
                maxTekrarharf = arr[i];
            } else if (sayac == maxSayac) {
                maxTekrarharf += ", " + arr[i];
            }
            sayac = 0;
        }
        System.out.println(maxTekrarharf);
    }
}

