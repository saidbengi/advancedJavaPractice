package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str=scan.nextLine();
        System.out.println(str.contains(" "));
    }
}

