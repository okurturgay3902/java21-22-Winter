package day37_inheritance;

public class Corolla extends Toyata {
	
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";

	public static void main(String[] args) {
		
			Corolla 				arb1			=		new 		Corolla();
		//Classismi && Data turu	obje ismi	assigment	keyword		Constructor
		
		/*Javada obje olusturdugumuz her class ismi ayni
		zamanda bir data turu'dir Bu ornek icin Corolla hem class adi hemde olusturdugumuz
		arb1 objesinin data type'idir
		Java'da obje uretilen her bir class ayni zamanda non-primitive data turu olur
		Obje olustururken constructor'i takip et
		Class uyesi bulmak icin data turune bak
		constructorun tek fonksiyonu var obje olusturmak. 
		data turu ise bize hangi clas'a gidecegini soyluyor
		*/	
			
		System.out.println(arb1.calisiyorMu);// true
		System.out.println(arb1.tekerSayisi);//4
		System.out.println(arb1.uretimYeri);//Turkiye
			
		Toyata arb2= new Corolla(); //Toyotalardan Corolla uretiyorum
		
				
		System.out.println(arb2.calisiyorMu); //true
		System.out.println(arb2.tekerSayisi); //0  data turu Toyota oldu icin ordan basliyor
		// arb2. yazdigimda Corolla class'ini goremiyor data turunden
		
		Araba arb3=new Corolla ();
		System.out.println(arb3.calisiyorMu); //true
		System.out.println(arb3.tekerSayisi); //0
		
		
	}

}
