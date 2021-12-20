package day46_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		
		/* verilen bir Arraydeki tekrar eden sayilari silip
		 * unique degerlerden olusan bir array olusturunuz
		 */
		
		int arr[]= { 3,4,6,4,2,4,6,8,2,3,1,2,4,6,7};
		
		Set<Integer> benzersizSet = new HashSet<>();
		
		for (Integer each : arr) {
			benzersizSet.add(each);
			
		}
		System.out.println(benzersizSet); // [1, 2, 3, 4, 6, 7, 8] 
		
		
		Object[] tekrarsizArr = benzersizSet.toArray(); // set'i array'e cevirdik
		
		System.out.println(Arrays.toString(tekrarsizArr));// [1, 2, 3, 4, 6, 7, 8]
		
		

	}
	/*
	Set Methods :
.add(eleman);-->Setâ€™e eleman ekler
.addAll(collection);-->istenen collectionâ€™in tum elemanlarini ekler
.contains(eleman);-->istenen eleman settâ€™te varsa true, yoksa false dondurur.
.containsAll(collection);-->istenen collectionâ€™in tumu aranan sette var ise true, yoksa false dondurur
.remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false dondurur
.removeAll(collection);-->istenen collectionâ€™in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false dondurur
.equlas(set2);-->istenen set2â€™le tum elemanlar ayni ise true, yoksa false dondurur
.retainAll(collection1);-->collection1â€™nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false dondurur(kesiÅŸen ortak elemanlarÄ± dÃ¶ndÃ¼rÃ¼r.)
.clear();-->sett'teki Tum elemanlari siler
.isEmpty();-->Sette hic eleman yoksa true, varsa false dondurur
.size();-->setâ€™in eleman sayisini verir
		    */
		

}
