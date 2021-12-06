package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		
		System.out.println(tarihSaat); //2021-12-02T21:46:06.399736700
		
		// Eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek
		// gun / ay / yil saat:dakika
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MM / YYYY EEE HH : mm  a");
		System.out.println(duzenle.format(tarihSaat)); //02 / 12 / 2021 Per 22 : 06  ÖS
		
		/* format olustururken
		 * GUN:
		 * d: basta 0 varsa onu yazmadan gun numarasi
		 * dd: tek haneli gunleri 01 gibi yazar
		 * DDD: yilin kacinci gunu
		 * E-EE-EEE: Gun isminin ilk 3 harfi 
		 * EEEE : Gun isminin tamamini
		 * 
		 * AY (Ay icin M, dakika icin m kullanilir):
		 * M: basta 0 varsa onu yazmadan ay numarasi
		 * MM: tek haneli aylari 01 gibi yazar
		 * MMM: Ay isminin ilk 3 harfi
		 * MMMM: Ay isminin tamamini
		 * 
		 * YY: yilin son iki rakamini
		 * YYYY: Yilin tamamini
		 * 
		 * Saat : (24 saat uzerinden istiyorsak H, 12 saat uzerinden istiyorsak h)
		 * 
		 * HH : saatin tamami
		 * H : tek rakamli ssaat olursa sadece saati 
		 * 
		 * a yazarsak AM veya PM degerini yazar
		 */

	}

}
