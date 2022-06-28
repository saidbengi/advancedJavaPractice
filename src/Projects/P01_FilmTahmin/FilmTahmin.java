package Projects.P01_FilmTahmin;

import java.util.*;

public class FilmTahmin {

    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST",
            "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");

        int filmSecimIndex = scan.nextInt();
        int hak = film.get(filmSecimIndex - 1).length() * 2;

        StringBuilder secilenFilm = new StringBuilder(film.get(filmSecimIndex).replaceAll("\\w","-"));
        System.out.println(secilenFilm);
        System.out.println(film.get(filmSecimIndex).length() + " harfli yabanci film sectiniz. Filmi tahmin etmek icin "+
                hak+" hakkiniz var");
        char harf =' ';
        int tahminSayisi=0;
        int dogruTahminSayisi=0;
        String str ="";
        do {
            System.out.println("Yanlis tahmin sayisi : "+(tahminSayisi-dogruTahminSayisi)+"/"+hak+"\ntahmin ettiginiz harfi giriniz");
            harf=scan.next().toUpperCase().charAt(0);
            str += harf;//harf str'ye atandı

        }while ((tahminSayisi - dogruTahminSayisi)!= hak);
        if ((tahminSayisi - dogruTahminSayisi) == 2 * film.get(filmSecimIndex).length()) {
            System.out.println("yanlıs tahmin sayısı : " + (tahminSayisi - dogruTahminSayisi));
            System.out.println("agam game over yine bekleriz....tahmin edemedigin film : " + film.get(filmSecimIndex));
        }


    }
}