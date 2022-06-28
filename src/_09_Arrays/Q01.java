package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    static Scanner scan = new Scanner(System.in);

    /* TASK :
     kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
     ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
     java code create ediniz.

     */
    public static void main(String[] args) {
        System.out.println("Array kac elementten olussun soyle bagalim");
        int arr[] = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+". elementi giriniz : ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int fark = arr[arr.length - 1]-arr[0];
        System.out.println(fark);

    }

}
