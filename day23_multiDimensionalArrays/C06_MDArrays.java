package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_MDArrays {

	public static void main(String[] args) {
		/* Verilen iki Arrays i birlestiren ve 
		sonucu birlesikArray isminde bir array e kaydeden 
		bir metod olusturunuz
		*/
		
		int arr1[]= {3,5,7,10};
		int arr2[]= {2,4,6,8,9};
		
		int birlesikArray[]=birlestir(arr1,arr2); 	//metod olusturduk
		
		Arrays.sort(birlesikArray);
		
		System.out.println(Arrays.toString(birlesikArray)); 	//[3, 5, 7, 10, 0, 0, 0, 0, 0]

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[] =new int[arr1.length+arr2.length];
		
		
		for (int i = 0; i < arr1.length; i++) {
			
			birlesikArray[i]=arr1[i];
		}
			
		for (int i= 0; i < arr2.length; i++) { 	//2. arrayin elemanlarini alacagiz
				
				birlesikArray[i+ arr1.length]=arr2[i];
				
			}
			
				
		
		
		return birlesikArray;
	}

}
