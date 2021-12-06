package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		/*
		 * kullanicidan toplanmakuzere sayilar isteyin sayi adedi 10'u gecerse veya
		 * toplam 500'u gecerse "Bu kadar sayi yeter"
		 * "...adet sayi girdiniz, toplami ....." yazdirin.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int toplam = 0;
		int sayac = 0;

		while (sayac < 10 && toplam <= 500) {

			System.out.println("Lutfen toplama eklemek icin bir sayi giriniz");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
		}

		System.out.println("Bu kadar sayi yeter");
		System.out.println(sayac + ", adet sayi girdiniz ve sayilarin toplami :" + toplam);

		scan.close();	

	}

}
