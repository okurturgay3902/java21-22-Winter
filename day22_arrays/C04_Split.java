package day22_arrays;

import java.util.Arrays;
import java.util.Iterator;

public class C04_Split {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.,"
		// cumlesinin kelimelerini ozel karakterler ve noktalama isaretleri olmadan
		//harf sirasina gore yazdiralim
		

		String str= "Java ogrendim, #cok para ?kazandim.";
		
		String arr1[]=str.split(" ");
		System.out.println(Arrays.toString(arr1)); //[Java, ogrendim,, #cok, para, ?kazandim.]
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]= arr1[i].replaceAll("\\W", "");
			
			
			
		}
		System.out.println(Arrays.toString(arr1)); //[Java, ogrendim, cok, para, kazandim]
		
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1)); // [Java, cok, kazandim, ogrendim, para]
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
			
			
		}
		
	}

}
