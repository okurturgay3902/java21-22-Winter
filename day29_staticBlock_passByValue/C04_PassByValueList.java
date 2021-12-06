package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		/* bir list (Arrayda olabilir) olusturalim
		 * sonra list elemanlarini degistir method'u yazalim
		 * orada list elemanlarini degistirelim
		 * method void olsun
		 * main methoda dondukten sonra yeniden list'i yazdiralim
		 */
		
		List<String> harfler = new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
				
		listElemanlarDegistir(harfler); //mathod olusturduk
		System.out.println("Main methoda donunce list :"+harfler); //[D, B, C]
		
		/*Java da list ve Array gibi objeler icin de pass By Value gecerlidir
		 * Yani farkli bir method da array veya list'e yeni deger atamasi yaparsiniz
		 * orjinal array veya list degismez 
		 */
		
		listDegistir(harfler);
		System.out.println("liste yeni list atadiktan sonra Main methoda donunce list :"+harfler);//[D, B, C]

	}

	private static void listDegistir(List<String> harfler) {
		harfler=new ArrayList<>();
		System.out.println("Liste yeni deger atayinca :"+harfler); //[]
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("Methodda degistirdigimiz list :"+harfler); //[D, B, C]
		
	}

}
