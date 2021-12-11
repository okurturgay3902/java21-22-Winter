package day39_overriding_polymorphism;

public class C01 {
	
	public static void staticMethod() {
		System.out.println("Parent class static method calisti");
	}
	
	private void privateMethod() {
		System.out.println("Parent class private method calisti");
		
	}
	
	public final void finalMethod() {
		System.out.println("Parent class final method calisti");
	}
	
	/*final demek bu son hali bir daha degistirilemez
	 * dolayisiyla final olarak tanimlana bir method override edilemez
	 * 
	 * 
	 * Child class ve Parent class ayni package de olduklarindan
	 * methodlarin acess modifier'lari public, protect 
	 */
}
