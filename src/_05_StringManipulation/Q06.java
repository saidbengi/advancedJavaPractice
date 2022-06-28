package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen e-mail giriniz");
        String mail= scan.nextLine();

        if (mail.endsWith("hotmail.com")){
            mail=mail.replaceAll("hotmail.com","gmail.com");
        }
        System.out.println(mail);
    }
}
