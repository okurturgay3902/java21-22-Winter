package day47_maps;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		
		/* 1- Bir map olusturmadan once map'e koyacagimiz Key ve Value degerlerini
		 * incelemeliyiz. Tum degerleri koyabilmek icin Key ve Value icin Object, Object secebiliriz
		 * ama bu durumda Map icerisindeki elemanlara ait bilgilere ulasmakta zorlanabiliriz.
		 * Data turunu secerken hem icine koyacagimiz tum elemanlari kapsayacak bir data turu secmeliyiz
		 * hemde icine koydugumuz elemanlari isleyebilecegimiz bir data turu secmeliyiz
		 * 
		 * 2- Map'i olustururken map'in turune karar vermemiz gerekir.
		 */
		
		Map<Integer, String> sinif=new HashMap<>();
		
		sinif.put(101, "Ali, Can, J.Dev");
		sinif.put(102, "Veli, Yan, QA");
		sinif.put(103, "Ali, Yan, C#");
		
		int no=104;
		String isim= "Ayse";
		String soyisim="Can";
		String brans="QA";
		
		sinif.put(no, isim+", "+ soyisim +", "+ brans);
		
		System.out.println(sinif); //{101=Ali, Can, J.Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#, 104=Ayse, Can, QA}
		
		System.out.println(sinif.get(101)); //Ali, Can, J.Dev
		
		System.out.println(sinif.get(104)); //Ayse, Can, QA
		
		// Mapteki tum key'leri gorelim
		System.out.println(sinif.keySet());// [101, 102, 103, 104]
		
		//Acaba Mapteki tum Value'lari gormek istersek
		System.out.println(sinif.values());// [Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]
											// Collection olarak verdi
		//Ancak yazdirma islemi disinda bir islem yapamayiz
		
		
		//Siniftaki tum ogrencilerin isimlerini bir listeye ekleyip yazdiralim
		
		List<String> valueList=new ArrayList<>((sinif.values()));
		
		
		System.out.println(valueList); //[Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]
		
		System.out.println(valueList.size()); //4  elemanlari grup olarak sayiyor
		
		List<String> isimListesi=new ArrayList<>();		
		String bilgiler[]= new String[3];
		
		for (int i = 0; i < valueList.size(); i++) {
			
			bilgiler = valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);
			
		}
		System.out.println(isimListesi); //[Ali, Veli, Ali, Ayse]
		
		
		
		
		
		
		

	}

}
