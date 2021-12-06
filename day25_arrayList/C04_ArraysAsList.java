package day25_arrayList;


import java.util.Arrays;

import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		
		
		String arr[]= {"A", "b", "C", "d"};
		
		List<String> arraydenList=Arrays.asList(arr);
		
		System.out.println("List :"+ arraydenList); //[A, b, C, d]
		
		/* arraydenList.add("F"); //RTE hatasi :UnsupportedOperationException desteklenmeyen islem
							   //CTE olmasi icin sytex te problem olmasi lazim
		
		 Bu sekilde Arrays classindan yardim alarak arr i list e cevirir sek
		olusturdugumuz listin boyutu sabit olur 
		dolayisi ile add() veya clear() gibi metodlari calistirmak isteseek
		UnsupportedOperationException hatasi verir
		*/
		
		arr[1]="Z";
		
		System.out.println("Arrayi degistirdikten sonra, array :"+Arrays.toString(arr)); //[A, Z, C, d]
		
		System.out.println("Arrayi degistirdikten sonra, List :"+ arraydenList); //[A, Z, C, d]
		
		arraydenList.set(3, "D");
		System.out.println("Listi degistirdikten sonra, List :"+ arraydenList); //[A, Z, C, D]
		System.out.println("Listi degistirdikten sonra, array :"+Arrays.toString(arr)); // [A, Z, C, D]
		
		
		
		
		
		
		
	}

}
