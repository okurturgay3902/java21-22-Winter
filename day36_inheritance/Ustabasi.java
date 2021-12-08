package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class Ustabasi extends Isci{
	
	Ustabasi(){
		System.out.println("Ustabasi parametresiz constructor calisti");
		//Personel parametresiz constructor calisti
		//Muhasebe parametresiz constructor calisti
		//Isci parametresiz constructor calisti
		//Ustabasi parametresiz constructor calisti
	}

	public static void main(String[] args) {
		
		Ustabasi ust1=new Ustabasi();
		
		/* Javada her class olusturuldugunda otomatik olarak
		 * default constructor olusturuldugu GIBI
		 * Child class'da olusturulan herbir constuctor'in
		 * ilk satirinda gizli super() olusturulur.
		 */

	}

}
