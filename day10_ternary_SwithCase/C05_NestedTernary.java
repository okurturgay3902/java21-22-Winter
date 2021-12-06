package day10_ternary_SwithCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// Soru: Eger calısan kadınsa 60 yasından buyuk oldugunda emekli olabilir,
		// calısan erkekse 65 yasından buyukse emeklı olabilir.		
		//her seferinde scannner olusturmak yerine
		//test datalarimizi veriable olarak da olusturabiliriz
		//kodlarimizi test edebiliriz
		
		char cinsiyet='K';
		int yas=65;
		
		
		String sonuc=cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsin" : "Emekli olamazsin") :
									 (yas>=65 ? "Emekli olabilirsin" : "Emekli olamazsin");
		
		
		System.out.println(sonuc);
		

	}

}
