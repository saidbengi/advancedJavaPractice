package _09_Arrays;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */


        String str ="ade1r4d3";
        String str1[]=str.split("");
        int sum = 0;
        for (int i = 0; i < str1.length; i++) {
             if (Character.isDigit(str1[i].charAt(0))){
                 sum+=Integer.valueOf(str1[i]);
             }
        }
        System.out.println("Rakamlar toplami : "+sum);
    }


}

