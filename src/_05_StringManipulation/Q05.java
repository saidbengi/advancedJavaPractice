package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */

        String str = "%13.99";
        String str2 = "%10.55";
       str=str.replace("%","");
       str2=str2.replace("%","");

        double sayi=Double.parseDouble(str);
        double sayi2=Double.parseDouble(str2);
        System.out.println(sayi+sayi2);


    }
}
