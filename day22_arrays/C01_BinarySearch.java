package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
	
		
	String isimler [] = {"Hacer", "Ainagul", "Emine", "Kutlu", "Murat", "asli"};
	
	//isimler arrayinda Murat var mi
	// Arrays de aramadan once siralama yapmaliyiz
	
	Arrays.sort(isimler);
	
	//Sort ile siralama yapinca array imiz kalici olarak degisir
	
	System.out.println(Arrays.toString(isimler));//[Ainagul, Emine, Hacer, Kutlu, Murat, asli]
	//sort method u elementleri natural order a gore siralar
	
	isimler[5]="Asli";
	
	System.out.println(Arrays.toString(isimler));//[Ainagul, Emine, Hacer, Kutlu, Murat, Asli]
	
	Arrays.sort(isimler);
	
	System.out.println(Arrays.toString(isimler));//[Ainagul, Asli, Emine, Hacer, Kutlu, Murat]
	
	System.out.println(Arrays.binarySearch(isimler, "Murat")); //5
	
	System.out.println(Arrays.binarySearch(isimler, "Kursat"));//-5
	
	System.out.println(Arrays.binarySearch(isimler, "Turgay"));//-7
	
	System.out.println(Arrays.binarySearch(isimler, "Hacer"));//3
	
	System.out.println(Arrays.binarySearch(isimler, "akin")); //-7 kucuk harf
	
	
	

	}

}
