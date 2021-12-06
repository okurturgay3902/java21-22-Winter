package day22_arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		
		
		String str= "Java ogrenmek, IT alaninda yer edinmek demektir";
		
		String arr1[]=str.split(",");
		System.out.println(Arrays.toString(arr1)); //[Java ogrenmek,  IT alaninda yer edinmek demektir]
		
		String arr2[]=str.split(" ");
		System.out.println(Arrays.toString(arr2)); //[Java, ogrenmek,, IT, alaninda, yer, edinmek, demektir]
		
		String arr3[]=str.split("");
		System.out.println(Arrays.toString(arr3));// butun karakterleri ayirir

	}

}
