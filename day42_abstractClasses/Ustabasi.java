package day42_abstractClasses;

public class Ustabasi extends Isci {
	
	public void statu() {
		
		System.out.println("Bu classdaki tum personel ustabasidir.  imza :Ustabasi");
	}

	public void maas() {
			System.out.println("Ustabaslari aylik 10000 tl maas alir. imza :Ustabasi");
		}
		
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza cozulunceye kadar calisir imza:Ustabasi");
	}
		
		
	/*obje olusturdugumuz en alttaki class parent class'lardaki methodlari o
	 * ovverride edince , class'dan olusturulan objeler endogru ve spesifik 
	 * ozelliklere kavustu. 
	 * 
	 * ama klasik parent-child iliskisinde tum methodlari ovverride etme mecburiyeti yoktur
	 * 
	 * java parent class'lardaki tum metodlari override etmek MECBURIYETI kazandirmak icin
	 * abstract class yapisini olusturmustur.
	 * 
	 * Yani bir class'i abstract olarak tanimlarsaniz child class'lar tum methodlari 
	 * override etmek zorundadir.
	 * 
	 * Dolayisiyla abstract yaptigimiz parent class'lar sadece kalip gorevi yapacaklar.	
	 */
	public static void main(String[] args) {
		
		Ustabasi ust1=new Ustabasi();
		ust1.statu();
		ust1.maas();
		ust1.mesai();

	}

}
