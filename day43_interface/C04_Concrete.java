package day43_interface;

public class C04_Concrete implements C03_Interface{ 

	public static void main(String[] args) {
		
		C04_Concrete concreteObje= new C04_Concrete();
		
		
		
		// Interface'de default keyword kullanarak olusturdugumuz body'si olan method'lara
		// child concrete class'lardan obje vasitasiyla ulasabilirim
		concreteObje.kaborta();
		
		
		// Interface'de static keyword kullanarak olusturdugumuz body'si olan method'lara
		// child concrete class'lardan interface ismi vasitasiyla ulasabilirim
		C03_Interface.sanzuman();

	}
	// Bir interface'de static veya default keyword kullanarak body'si olan bir method olusturursak
		// Bu interface'e implements eden concrte child class'lar bu method'lari
		// implement etmek ZORUNDA DEGILDIR
		@Override
		public void motor() {

}
}