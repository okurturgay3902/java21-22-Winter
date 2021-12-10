package day38_overriding;

public class KumesHayvanlari extends Kuslar{

	public static void main(String[] args) {
		
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme(); //Tum hayvanlar beslenir
		kms1.hareket(); //Kumes Hayvanlari yuruyerek hareket edeer
		kms1.solunum(); //Kuslar akcigerleri ile nefes alir
		
		Kuslar kms2=new KumesHayvanlari();
		kms2.beslenme();//Animals==> Tum hayvanlar beslenir
		kms2.hareket(); //Kuslar ==> Kumes Hayvanlari yuruyerek hareket edeer****
		kms2.solunum(); //Kuslar ==> Kuslar akcigerleri ile nefes alir
		//Kendi spesifik ozellikleri disinda kuslara tabi olur
		//ama spesifik bir durum varsa farkini ortaya koyar
		
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme();//Tum hayvanlar beslenir
		kms3.hareket(); //Kuslar ucarak hareket edeer******
		kms3.solunum(); //Kuslar akcigerleri ile nefes alir
		
		
		Animals kms4=new KumesHayvanlari();
		kms4.beslenme(); // Animals ==> Tum hayvanlar beslenir
		kms4.hareket(); // Animals ==> Kumes Hayvanlari yuruyerek hareket edeer
		kms4.solunum(); // Animals ==> Kuslar akcigerleri ile nefes alir
		
		/*
		 * 1-parent-Child class'larda Overriding varsa Java Class calismadan bunlari isaretler
		 * 2-Bir obje ile method cagirinca Java Data turunun classindaki methoda gider
		 * 3- Gidilen method gecersiz kilinmissa(Overriden) Java Objenin Constructorina bakar
		 * Constructor ile Overriding method ayni class'da ise Overriding method calisir
		 */
		
		
		

	}
	
	public void hareket() {

		System.out.println("Kumes Hayvanlari yuruyerek hareket edeer");
	}

	

}
