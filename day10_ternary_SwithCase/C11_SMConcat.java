package day10_ternary_SwithCase;

public class C11_SMConcat {

	public static void main(String[] args) {
		// Strink olarak verilen bir degisken + ile isleme sokulursa
		// Java bunlari yan yana ekler. Buna Concatenation denir.
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim+" "+soyisim); //Ali Can
		
		//ayni islemi+ sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim)); //AliCan
		
		System.out.println(isim.concat(" ").concat(soyisim)); //Ali Can
		
		

	}

}
