package day43_interface;

public interface C03_Interface {
	
	// protected void motor();  Illegal modifier for the interface method motor;
								//only public, private, abstract, default, static and strictfp are permitted
	
	
	
		void motor(); //normal class'larda access modifier yazmazsaniz java default kabul eder 
					  // interface de ise access modifier yazmazsaniz java public olarak kabul eder
		
	//	private int sayi=10; //Illegal modifier for the interface field 
		
		int sayi=10; // public, final ve static otomatik olarak olusturur
		
		
		/*inteface'de bady'si olan bir method yazmak isterseniz
		 *  java size 2 secenek sunar
		 *  1- methodun basina "default" yazabilirsiniz
		 *  ancak buradaki default access modifier degil, Javanin interface iccin ozel 
		 *  kabul ettigi bir komuttur
		 *  
		 *  2- methodun basina "static" yazabilirsiniz
		 */
		
		public default void kaborta() {
			
			System.out.println("default keyword ile body olusturduk");
			
		}
		
		public static void sanzuman() {
			System.out.println("static keyword ile body olusturduk");
		}
		
	
	/*Interface, icinde sadece kendisinden tureyen siniflarin icini doldurmak
	 *  zorunda oldugu body'si olmayan method'larin olusturuldugu bir yapidir
	 * 
	 * kisacasi kendisini inherit eden class'lar icin, yerine getirmeleri gereken methodlari belirten 
	 * 
	 * interface bir cesit to do list'dir(Class degildir). Concrete classlari interface deki tum methodlari implement 
	 * etmek zorunda birakir. Nasil yapilacagina degil, ne yapilacagina odaklanir
	 * 
	 * Bir class birden fazla interface implement edilebilir.
	 * 
	 * ABSTRACT vs INTERFACE
     1) Abstract :
      1.1 - Class`dir.
      1.2 - Abstract ve concrete method`lar konabilir.
      1.3 - Kismi olarak abstraction saglar.
      1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
      1.5 - Hiz acisindan avantajlidir
      1.6 - Icindeki tum nesnelerin â€œpublicâ€� olmasi zorunlu degildir.
      1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
      1.8 - Abstract class constructor`a sahiptir 
     
     2) Interface : 
     2.1 - Class degildir.
     2.2 - Sadece abstract method`lar konabilir.
     2.3 - Tam abstraction (soyutluk) saglar
     2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
     2.5 - Hiz acisindan abstract class`a gore yavastir.
     2.6 - Icindeki tum nesnelerin â€œpublicâ€� olmasi gerekir.
     2.7 - Method'lar static olamaz
     2.8 - Abstract class constructor`a sahiptir
	 * 
	 */
	
	
	

}
