package day11_stringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		// Parametre olarak girilen bir char veya string in 
		// ilk index ini veriri
		
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s')); //4
		System.out.println(str.indexOf('J')); //14
		
		int index=str.indexOf("r"); // indexOf() metodu bize herzaman int bir deger doner
		
		System.out.println(index); //6 
		
		System.out.println(str.indexOf('q')); //-1
		
		//eger bir string in index degeri -1 gelirse o stringin olmadigini anlatir
		
		System.out.println(str.indexOf('A')); //-1
		
		System.out.println(str.indexOf("Java"));//14 parametre kelime olursa ilk karakterin sirasini verir
		
		System.out.println(str.indexOf('a',11)); //15 burada 11. karakterden sayarak ilk a nin siranumarasini verir
		
		System.out.println(str.indexOf("Jokey"));  // -1 hata verir
		
		System.out.println(str.indexOf("va og")); //16
		
		
		

	}

}
