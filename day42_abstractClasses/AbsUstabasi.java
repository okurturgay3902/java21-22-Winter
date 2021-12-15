package day42_abstractClasses;

public class AbsUstabasi extends AbsIsci{
	
	/*Eger bir class'da OBJE OLUSTURULMASINI istemiyorsak ve bu class'i 
	 * sadece CHILD CLASS'larin yapmalari gereken gorevleri belirlemek 
	 * icin kullaniyorsak abstraction yapariz.
	 * 
	 * Concrete bir child class parent'i olan abstract class'lardaki tum 
	 * abstract methodlari implement  etmelidir
	 * 
	 * ama parent'i olan abstract class'lardaki concrete method'lari implement
	 *  etmek zorunda degildir
	 * 
	 */

	public static void main(String[] args) {
		
		AbsUstabasi ust1=new AbsUstabasi();
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
		}
			
		

	@Override
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir. imza:Ustabasi");
		
	}

	@Override
	public void maas() {
		System.out.println("Ustabaslari aylik 10000 tl maas alir. imza :Ustabasi");
		
	}

	@Override
	public void statu() {
		System.out.println("Bu classdaki tum personel ustabasidir.  imza :Ustabasi");
	}



	@Override
	public void abstractMethod() {
		// Personel class'indan geldi
		
	}
		
		
	
	}


