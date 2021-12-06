package day10_ternary_SwithCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
		// verilen Stringin tamamini buyuk veya kucuk harfe cevirir
		
		String isim= "aLi"; // bunu Ali olarak yazdiralim
		
		System.out.println(""+isim.toUpperCase().charAt(0)+
						isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));
		
		// "" eklememizin sebebi matematiksel islemden dolayi ascii kodu calisir
		
		// turkce lokal harfler kullanarak tamamini kucuk harfe cevirelim
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));

	}

}
