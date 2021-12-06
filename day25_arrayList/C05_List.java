package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		/*
		 * verilen bir listede, icinde belirli bir harf olan elemanlari silen metod
		 * yaziniz
		 */

		List<String> str = new ArrayList<>();

		str.add("Jeyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");

		System.out.println(str); // [Jeyhun, Yildiz, Mustafa, Tugba, Turgut]

		String silinecekharf = "a";

		killThemAll(str, silinecekharf); //metod olusturduk
		
		str=killThemAll(str, silinecekharf);

	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {

		for (int i = 0; i < str.size(); i++) {

			if (str.get(i).contains(silinecekharf)) {

				str.remove(i);
				i--; // silmeden dolayi kayan Index ten baslamak icin
			}
		}

		System.out.println(str);

		return null;
	}

}
