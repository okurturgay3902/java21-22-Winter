package day39_overriding_polymorphism;

public class C02 extends C01{

	public static void main(String[] args) {
		
		C02 obj1 = new C02();		
		obj1.privateMethod(); //Child class private method calisti
		obj1.staticMethod(); //Child class static method calisti
		
		
		C01 obj2 = new C02();		
		// obj2.privateMethod(); data turu C01 oldugundan oncelikle C01 class'indaki 
		//methoda bakmamiz gerekir ancak private oldugundan ulasamaz
		//ulasamadigimiz bir methodu override yapamayiz
		//Dolayisiyla signature ayni olmasina RAGMEN bu ikisi farkli method olarak calisir
		
		obj2.staticMethod(); //Parent class static method calisti
		// static methodlar override edilemez
		//Dolayisiyla signature ayni olmasina RAGMEN bu ikisi farkli method olarak calisir
		
		// Polymorphism=Bir nesnenin birden fazla farklı nesneymış gibi davranması gibi
		// cok bicimlilik 

	}
	
	public static void staticMethod() {
		System.out.println("Child class static method calisti");
	}
	
	
	private void privateMethod() {
		System.out.println("Child class private method calisti");
		
	}
	
	/*
	public final void finalMethod() {
		System.out.println("Parent class final method calisti");
	}
	****final olarak olusturulan method overloding yapilamaz
	*/
}
