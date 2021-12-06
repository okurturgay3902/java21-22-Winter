package day22_arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel"
		//cumlesinin kelimelerini ters sirada yazdirin
		
		
		String str= "Java ogrenmek cok guzel";
		
		String arr1[]=str.split(" ");
		System.out.println(Arrays.toString(arr1)); //[Java, ogrenmek, cok, guzel]
		
		for (int i =  arr1.length-1; i >= 0; i--) {
			
			System.out.print(arr1[i]+ " "); //guzel cok ogrenmek Java
			
		}
		
		
		
		
		

	}

}
