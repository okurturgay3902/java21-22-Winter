package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun. 
		
		String arr[]=new String[4]; // Uzun yol
		arr[0]="Ali";
		arr[1]="Veli";
		arr[2]="Ayse";
		arr[3]="Fatma";
		
		String arr2[]= {"Ali", "Veli", "Ayse", "Fatma"}; //Kisa yol
		
		//Soru 2: Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin
		
		arr2[0]= "Can";
		arr2[2]= "Gul";
		
		System.out.println(arr2[1]);
		
		
		//son elementi yazdir
		
		System.out.println(arr[arr.length-1]); //
		
		

	}

}
