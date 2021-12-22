package day48_maps_TheEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
	/* Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri 
	 * list olarak donduren bir method yaziniz.
 	map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
 	Istenen dil  java
 	Sonuc  [Ali, Veli]
	 */
	
		Map<Integer,String> soruMap=MapOlustur.myMap();
		
		String istenenDil="Java";
		
		
		dilBilenListesiOlustur(soruMap,istenenDil);
		

	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		
		List<String> dilBilenListesi=new ArrayList<>();	
		
		// soruMap.values(); //bana collection dondurur
		
		List<String> valueList=new ArrayList<>(soruMap.values());
		/*valueList==>eleman sayisi 3 
		 * 
		 */
		
		
		
		
		return dilBilenListesi;
		
		
		
		
	}

}
