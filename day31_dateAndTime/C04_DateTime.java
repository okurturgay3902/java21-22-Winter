package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		/* bir String ve bir int veriable olusturalim
		 * bir loop icerisinde bu veriablelari 1000 kere degistirelim
		 * ve islem surelerini kiyaslayalim.
		 */
		
		//verilen iki dogum tarihinin hangisinin daha once dogdugunu bulunuz
		
		LocalTime saat=LocalTime.now();
		System.out.println("Baslangic saati: "+saat);
		
		int sayi=10;
		
		for (int i = 0; i < 10000; i++) {
			sayi++;
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("Bitis saati: "+saatBitis);
		
		/*Eger bir islemin baslangic ve bitis zamani kaydetmek istiyorsak
		 * hem basinda hem de sonun da LocalTime objesi olusturmaliyis
		*/
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("int For loop "+ (nanobitis-nano1)+" nano saniyede tamamladi");
		
	
		
		LocalTime saatS=LocalTime.now();
		System.out.println("Baslangic saati: "+saat);
		
		String str="Celil";
		
		for (int i = 0; i < 10000; i++) {
			sayi++;
		}
		
		LocalTime saatBitisS=LocalTime.now();
		System.out.println("Bitis saati: "+saatBitisS);
		
		/*Eger bir islemin baslangic ve bitis zamani kaydetmek istiyorsak
		 * hem basinda hem de sonun da LocalTime objesi olusturmaliyis
		*/
		
		double nanoS=saatS.getNano();
		double nanobitisS=saatBitisS.getNano();
		
		System.out.println("String For loop "+ (nanobitis-nanoS)+" nano saniyede tamamladi");
		
		
		double stringSure=nanobitisS-nanoS;
		double intSure=nanobitis-nano1;
		
		System.out.println("int Stringden "+ (stringSure-intSure)+ "nano saniye kadar hizli");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
