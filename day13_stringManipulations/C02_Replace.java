package day13_stringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayisinin
		//binden buyuk olup olmadigini yazdirin
		
		
		String sonuc="10.000";
		
		sonuc=sonuc.replace(".", ""); // 10000 e cevirdik ve = den dolayi kalici degisti
		
		
		//direk sonuc>1000 desek hata verir stringi 10000 le karsilastiramaz
		
		if (Integer.valueOf(sonuc)>1000) {
			System.out.println("Bulunan sonuc sayisi 1000'den buyuk");
		} else {
			System.out.println("Bulunan sonuc sayisi 1000'den kucuk");
		}
		
				

	}

}
