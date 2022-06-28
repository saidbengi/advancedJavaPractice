package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int arr[]={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        ardisikTopla(arr);
        System.out.println(ardisikTopla(arr));

    }

    private static List<Integer> ardisikTopla(int[] arr) {
        List<Integer>toplananSayiList = new ArrayList<>();
        int count = 0;
        int toplananSayi = 1;

        while (arr.length-toplananSayi>=count){// sayilar bitene kadar action
            int toplam = 0;

            for (int i = 0; i <=count ; i++) {
                toplam+=arr[toplananSayi-1+i];
            }
            count++;
            toplananSayi+=count;
            toplananSayiList.add(toplam);
        }
        return toplananSayiList;
    }

}

