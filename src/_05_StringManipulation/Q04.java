package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli kelime giriniz");
        String kelime = scan.next();
        String terskelime="";
        if (!(kelime.length()==4)){
            System.out.println("Lutfen 4 harfli kelime giriniz");
        }else {


            for (int i = kelime.length()-1; i >= 0; i--) {
                terskelime+=kelime.charAt(i);
            }
            System.out.println(terskelime);
        }



    }
}
