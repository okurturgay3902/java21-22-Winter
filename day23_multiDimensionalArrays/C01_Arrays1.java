package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Arrays1 {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin

		int arr[] = { 3, 4, 5, 6, 3, 5, 8, 3, 4, 9 };

		int silinecekEleman = 5;

		// array de yeni eleman ekleyemeyiz veya var olan elemanlari silemeyiz
		// cunku Array in declare edilen uzunlugu degismez

		// Bu soru da istenen elementi sildigimizde geriye kac element kaliyor bulmamiz
		// lazim

		// silinecek sayi adedini bulalim

		int sayac = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == silinecekEleman) {

				sayac++;
			}

		}
		System.out.println(sayac);

		int yeniArrayUzunluk = arr.length - sayac;

		// yeni Array i olusturabiliriz

		int yeniArr[] = new int[yeniArrayUzunluk];

		// simdi eski Array den elemanlari alip
		// silinecek elemana esit olmayanlari yeni array e atmaliyiz.

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != silinecekEleman) {

				yeniArr[j] = arr[i];
				j++;

			}
		}
		System.out.println(Arrays.toString(yeniArr));

	}

}
