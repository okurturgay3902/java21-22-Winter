package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {

	public static void main(String[] args) {
		// 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen rakamlari toplamini bulmak icin pozitif bir tamsayi giriniz");

		int sayi = scan.nextInt();
		int sayac = 0;

		int rakamlarToplami = 0;
		int rakam = 0;

		while (sayi > 0) {

			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;
			sayac++;
		}

		System.out.println("Girdiginiz sayinin rakamlar toplami :" + rakamlarToplami);
		System.out.println("girdiginiz sayi " + sayac + " basamaklidir.");
		scan.close();
	}

}
