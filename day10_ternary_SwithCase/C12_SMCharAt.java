package day10_ternary_SwithCase;

public class C12_SMCharAt {

	public static void main(String[] args) {
		// CharAt(istenenIndex) metodu istedigimiz indexdeki karakteri bize verir.
		
		
		String kurs= "Techproeducatin";
		
		System.out.println(kurs.charAt(5)); //r
		
		//index 0 dan baslar
		
		System.out.println(kurs.charAt(0)); // bize ilk harfi verir
		
		System.out.println(kurs.charAt(15)); // son harfi verir
		
		System.out.println(kurs.charAt(16)); //hata verir
		

	}

}
