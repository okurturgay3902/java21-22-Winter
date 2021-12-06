package day22_arrays;

import java.util.Arrays;

public class C05_Split {

	public static void main(String[] args) {
		
		
		int[] random= {6, -4, 12, 77, 5, 0, -10};
		
		int x= 12;
		
		int y = Arrays.binarySearch(random, x);
		
		System.out.println(y); //sort yapilmadigi icin sonuc ongorulemez
		

	}

}
