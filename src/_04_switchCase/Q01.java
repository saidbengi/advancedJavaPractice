package _04_switchCase;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu giriniz : ");
        int not = scanner.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Lutfen gecerli not giriniz...");
        } else {
            switch (not) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("D");
                    break;
            }
            switch (not / 10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("D");
                    break;
                case 5:
                    System.out.println("C");
                    break;
                case 6:
                case 7:
                    System.out.println("B");
                    break;
                case 8:
                case 9:
                case 10:
                    System.out.println("A");
                    break;

            }
        }
    }
}