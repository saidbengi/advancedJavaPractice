package _06_Method_Creation;

public class Q06 {

 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
 public static void main(String[] args) {
     String str="javacılar çoook afilli arkadaşlar";
     birKereYazdir(str);
     System.out.println(birKereYazdir(str));






 }

    private static String birKereYazdir(String str) {
     String str2="";

        for (int i = 0; i < str.length(); i++) {
                if (!str2.contains(str.substring(i,i+1))){
                    str2+=str.substring(i,i+1);
                }

            }





     return str2;
    }
}
