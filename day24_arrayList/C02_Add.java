package day24_arrayList;

import java.util.ArrayList;

import java.util.List;

public class C02_Add {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();

		System.out.println("Bos liste : " + isimler);

		isimler.add("Ali");

		System.out.println("Bir eleman : " + isimler);

		isimler.add("Veli");

		System.out.println("Iki eleman : " + isimler);
		// add method u listenin sonuna ekleme yapar

		isimler.add("Can");
		System.out.println("Uc eleman : " + isimler); // Uc eleman : [Ali, Veli, Can]

		isimler.add(1, "Ayse");
		System.out.println("1. indexse ayse ekledik : " + isimler); //[Ali, Ayse, Veli, Can]

		// isimler.add(5); deklare ederken belirtigimiz
		// data turunden baska data turunden ekleme yapamayiz.

		List<String> liste2 = new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");

		System.out.println("Liste 2 : " + liste2); //[Gunter, Emrah]

		isimler.addAll(4, liste2);
		System.out.println("Liste2 yi ekledik : " + isimler);
		// sona liste2 yi ekledik : [Ali, Ayse, Veli, Can, Gunter, Emrah]

		isimler.addAll(liste2);
		System.out.println("index olmadan Liste2 yi tekrar ekledik : " + isimler);
		// index olmadan Liste2 yi tekrar ekledik : [Ali, Ayse, Veli, Can, Gunter, Emrah, Gunter, Emrah]

	}

}
