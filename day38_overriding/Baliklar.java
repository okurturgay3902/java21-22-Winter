package day38_overriding;

public class Baliklar extends Animals {

	public static void main(String[] args) {

		Baliklar balik1 = new Baliklar();

		balik1.beslenme(); // Tum hayvanlar beslenir
		balik1.hareket(); // Baliklar yuzerek hareket edeer
		balik1.solunum(); // Baliklar solungaclari ile nefes alir
	}
	/*Overridding gecersiz kilan
	Child class'daki bir method parent class'dan bir method'u override ediyorsa
	bunu istersek @Override notasyonu ile deklere edebiliriz
	deklere etmesekte kodlarimiz calisir
	ancak deklere ettigimizde java overriden methodu surekli kontrol eder
	ve o method da overriding e uymayan bir degisiklik olursa CTE verir.
	*/
	@Override
	public void hareket() {

		System.out.println("Baliklar yuzerek hareket edeer");
	}

	public void solunum() {

		System.out.println("Baliklar solungaclari ile nefes alir");
	}

	/*
	 * public void solunum() {
	 * 
	 * System.out.println("Baliklar solungaclari ile nefes alir");
	 * System.out.println("hey");
	 * 
	 * }	  
	 * ****Signature (metod ismi ve parametreler) ayni olan iki metot ayni class da hata verir****
	 */
}
