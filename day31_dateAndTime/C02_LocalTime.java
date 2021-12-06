package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		LocalTime saat=LocalTime.now();
		System.out.println("Baslangic saati: "+saat); //21:05:00.133714200
		
		int sayi=10;
		
		for (int i = 0; i < 100000; i++) {
			sayi++;
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("Bitis saati: "+saatBitis);
		
		/*Eger bir islemin baslangic ve bitis zamani kaydetmek istiyorsak
		 * hem basinda hem de sonun da LocalTime objesi olusturmaliyis
		*/
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("For loop "+ (nanobitis-nano1)+" nano saniyede tamamladi");
		
		System.out.println(saat.getMinute()); //30
		System.out.println(saat.plusMinutes(10000));// 20:10:46.587007
		System.out.println(saat.minusHours(20)); //01:32:02.681108300
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat); // 23:35:51.096464200
		
		
		
		
		
	}

}
