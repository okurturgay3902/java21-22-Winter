package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		// 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen rakamlari toplamini bulmak icin pozitif bir tamsayi giriniz");

		int sayi = scan.nextInt();

		int rakamlarToplami = 0;
		int rakam = 0;

		String sayiStr = "" + sayi; // basamak sayisini bulmak icin string yaptik length kullandik

		for (int i = 1; i <= sayiStr.length(); i++) {
			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;

		}

		System.out.println("Girdiginiz sayinin rakamlar toplami :" + rakamlarToplami);

		scan.close();
	}

}
