package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {
	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();

		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");

		System.out.println(isimler); // [Kutlu, Emrah, Ferhat]

		Collections.sort(isimler);

		System.out.println(isimler); // [Emrah, Ferhat, Kutlu]

		isimler.add("Huseyin");
		isimler.add("filiz");
		
		System.out.println(isimler); // [Emrah, Ferhat, Kutlu, Huseyin, filiz]
		
		Collections.sort(isimler);
		System.out.println(isimler); // [Emrah, Ferhat, Huseyin, Kutlu, filiz] kucuk harfler buyuklerden sonra

	}

}
