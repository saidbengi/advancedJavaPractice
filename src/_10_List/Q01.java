package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        List<String> aOlmayanIsimler = new ArrayList<>();// a olmayan isimlerin atanacagi bos list create edildi

        for (String w : isimler) {
            if (!w.toLowerCase().contains("a")) {
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan isimler " + aOlmayanIsimler);
        for (String each:isimler
             ) {
            System.out.println(each);
        }

        isimler.clear();
        isimler.addAll(aOlmayanIsimler);
        System.out.println(isimler);

    }


}
