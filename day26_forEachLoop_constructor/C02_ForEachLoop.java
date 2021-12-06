package day26_forEachLoop_constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		/*
		 * Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini
		 * For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 */

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int carpim = 1;
		int toplam = 0;

		for (int each : arr) {

			carpim *= each;
			toplam += each;
		}

		System.out.println("Arrayin elemanlari carpimi :" + carpim);

		System.out.println("Arrayin elemanlari toplami :" + toplam);

	}

}
