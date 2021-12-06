package day10_ternary_SwithCase;


public class C06_NestedTernary {

	public static void main(String[] args) {
		// Verilen karakteri inceleyin
		// kucuk harf ise consola “Kucuk Harf” ,
		// buyuk harfse consola “Buyuk Harf”
		// yoksa “girdiginiz karakter harf degil” yazdirin.
		
		
		char krk='A';
		
		String sonuc= (krk>='a' && krk<='z') ? "Kucuk Harf" :(
				(krk>='A' && krk<='Z') ? "Buyuk Harf" : "Girilen Kararkter Harf Degil");
		
		
		System.out.println(sonuc);
        
        
		

	}

}
