package day30_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {
		// String immutable(degistirilemez) bir class iken List mutable(degistirilebilir) dir
		
		String str="Ali";
		
		str.toUpperCase(); //str ==> ALI atama olmadigindan havada kaliyor
		
		System.out.println(str); // Ali
		
		System.out.println(str.toUpperCase()); // ALI
		
		System.out.println(str); // Ali String Immutable oldundan
		
		str= "Can";
		System.out.println(str); // Can  eski str duruyor ama yeni obje olusturuluyor
								// referansi degisiyor
		
		
		List<String> isimler =new ArrayList<>();
		
		System.out.println(isimler); // []
		
		isimler.add("Ali");
		System.out.println(isimler); // [Ali]
		
		isimler.set(0, "Veli");
		System.out.println(isimler); // [Veli]  yeni obje olusturmuyor uzerine yaziyor
		
		isimler.remove(0);
		System.out.println(isimler); //[]
		
		
	}

}
