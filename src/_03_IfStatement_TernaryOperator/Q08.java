package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen urun adedini giriniz");
		int urunAdedi=scan.nextInt();
		System.out.println("Lutfen liste fiyatini giriniz");
		double listeFiyati=scan.nextInt();
		double toplamfiyat;
		System.out.println("Musteri kartiniz var mi? varsa Y yoksa N tuslayiniz");
		char card =scan.next().toUpperCase().charAt(0);

		if (card=='Y'){
			if (urunAdedi>10){
				listeFiyati *= 0.8;
				toplamfiyat = listeFiyati * urunAdedi;
				System.out.println("%20 indirim kazandiniz.Odemeniz gereken fiyat : " + toplamfiyat);
			}else{
				listeFiyati*=0.85;
				toplamfiyat = listeFiyati*urunAdedi;
				System.out.println("%15 indirim hakki kazandiniz.Odemeniz gereken miktar: " + toplamfiyat);
			}



		}else if (card == 'N') {

			if (urunAdedi > 10) {

				listeFiyati *= 0.85;
				toplamfiyat = listeFiyati * urunAdedi;
				System.out.println("%15 indirim hakki kazandiniz.Odemeniz gereken miktar: " + toplamfiyat);
			} else{
				listeFiyati = listeFiyati - listeFiyati * 10 / 100;
				toplamfiyat = listeFiyati * urunAdedi;
				System.out.println("%10 indirim hakki kazandiniz.Odemeniz gereken miktar: " + toplamfiyat);
			}
		}else{
			System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
		}

	}

}
