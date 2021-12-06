package day26_forEachLoop_constructor;

public class Car {
	
	/* Java biz bir Class olusturduguzda  o class dan obje uretecegimizi
	 * bilir ve her class a default bir constructor yerlestirir
	 * java nin class a koydugu bu default constructor 
	 * 
	 * bir constructor olusturmak cok kolaydir
	 * method a benzer ama farklidir
	 * 
	 * 1-Consturactor ismi class ismi ile ayni olmalidir
	 * class isimleri buyuk harfle basladigi icin Consturactor ismi de buyuk harfle baslar
	 * (method dan 1. farki budur, methodlar kucuk harfle baslar)
	 * 
	 *  2- Constraktorlarin return  tyope i olmaz
	 *  (metoddan 2. farki budur, methodlarin mutlaak return type olmalidir)
	 */

	public Car(){
		
	}
	
	// Java'nin her class'da olusturdugu constructor budur.
	
	public int yil;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	/* Bugun itibariyle class'larda main method olma mecburiyeti kaldirilmistir :)
	 Ancak bildigimiz gibi main method olmayan bir class direk calistirilamaz
	 Main method'u olmayan class'lar baska class'lardan obje olusturularak kullanilmak uzere 
	 ihtiyac duyulan variable ve method'lari sakladigimiz bir depo gibidir
	 */
	
	}


