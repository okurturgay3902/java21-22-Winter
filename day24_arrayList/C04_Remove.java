package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");		
		
		System.out.println(harfler); //[A, Z, F, D]
		
		// System.out.println(harfler.remove(1)); //Z yazdirir kaldirilan elemani
		harfler.remove(1); //bu islemi yapiyor index ile
		
		System.out.println(harfler); //[A, F, D]
		
		harfler.remove("A"); //bu islemi yapiyor karakter ile bu islemi yazdirirsak True yazdirir
		
		System.out.println(harfler); //[F, D]
		
		System.out.println(harfler.remove("B")); // olmayan eleman icin remove yaparsak false yazdiri
		
		harfler.add("Z");
		harfler.add("Z");
		
		System.out.println(harfler.remove("Z")); //true
		
		System.out.println(harfler); //[F, D, Z]
		harfler.add("Z");
		
		harfler.removeAll(harfler); // verilen bir listeyi siler

		System.out.println(harfler); //[]
		
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler=new ArrayList<>();
		
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		System.out.println(harfler); //[A, Z, F, D]
		System.out.println(silinecekHarfler); //[A, C, F]
		
		System.out.println(harfler.removeAll(silinecekHarfler)); //true birseyler sildim diyo
		System.out.println(harfler); //[Z, D]
		System.out.println(silinecekHarfler); //[A, C, F]
		
		/*eger listemiz integer lardan olusuyorsa
		 * java remove(index) ve index(object) method lari karismasin diye
		 * girilen sayiyi index olarak kabul eder.
		 */
		
		
		
		
		
		
		
		
		
		

	}

}
