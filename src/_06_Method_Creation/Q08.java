package _06_Method_Creation;

import java.util.Arrays;
import java.util.Scanner;

public class Q08 {
  /*
    TASK :
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method create ediniz

     Test Data :
    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Bir str gir");
      String str=scan.nextLine();
      reverseWord(str);
      System.out.println(reverseWord(str));
  }

    private static String reverseWord(String str) {
      String str2="";
      String arr[]=str.trim().split(" ");

      for (int i = arr.length-1; i >= 0; i--) {
                str2+=arr[i]+" ";
            }

      return str2.trim();
    }

}
