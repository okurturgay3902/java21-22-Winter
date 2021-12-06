package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
int arr[] = {11,15,2,5,49,32};
		
		int toplam=0; 
		for (int i = 0; i < arr.length; i++) {
			toplam=toplam+ arr[i];
			
			
		}
			
		System.out.println("elementlerin toplami :"+toplam);
		
		
		
		//Arrayin tum elemanlarini kucukten buyuye ve buy kuc sirala
		
		Arrays.sort(arr); //kucukten buyuge siralama
		
		System.out.println(Arrays.toString(arr));
		
		
		
		// buyukten kucuge
		
		
		for (int i = arr.length-1; i >=0 ; i--) {
			
			System.out.print(arr[i]+" ");
			
		}
			//array yapmak icin, elemanlari tesr sirada yeni arraye tasiyabilirsiniz
			
			System.out.println(" ");
			
			int tersArray[]=new int[arr.length];
			
			for (int i = 0; i < tersArray.length; i++) {
				tersArray[i]=arr[arr.length-1-i];
				
			
			
		}
		
		System.out.println(Arrays.toString(tersArray));
		
	}

}
