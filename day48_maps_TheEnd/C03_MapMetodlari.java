package day48_maps_TheEnd;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMetodlari {

	public static void main(String[] args) {
		
		Map<Integer,String> ornek=MapOlustur.myMap();
		System.out.println(ornek);
		
		System.out.println(ornek.containsKey(110)); //false
		System.out.println(ornek.containsValue("JAVA"));//false bizim tek basina JAVA diye bir elemanimiz yok
		System.out.println(ornek.containsValue("Mustafa, Kan, JAVA"));//true

		Set<Entry<Integer,String>> entrySet = ornek.entrySet(); // Her bir elemanin adi entry 101=Ali, Can, java
		
		int sayac=1;
		
		for (Entry<Integer,String> each: entrySet) {
			
			System.out.println(sayac+ ".entry : "+ each);
			
			sayac++;
			
		}
		
		System.out.println(ornek.getOrDefault(110, "girilen key map'da yok")); //Ali, Yan, C#
		System.out.println(ornek.getOrDefault(103, "girilen key map'da yok")); //Ali, Yan, C#
		
		ornek.putIfAbsent(103, "Ali, Yan, C#"); // eklemeyecek cunku 103 var zaten
		
		ornek.putIfAbsent(110, "Fikri, Yan, Qa");// ekledi cunku 110 yok
		
		for (Entry<Integer,String> each: entrySet) {
			
			System.out.println(sayac+ ".entry : "+ each);
			
			sayac++;
			
		}
		
		String maptenString=ornek.toString(); //Stringe donusturdu
		System.out.println(maptenString);
		
		
		
		
		
		
		
		
		
	}

}
