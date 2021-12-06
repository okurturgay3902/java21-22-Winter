package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		/* kullanicidan iki tamsayi isteyin
		 * ilk sayidan baslayarak ikinci sayiya kadar 
		 * ucer ucer yazdirin
		 * ikinci sayi dahil olmak zorunda degil
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfeniki iki sayi girin \nilk sayidan sonra enter e basin");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		//int yerine char alirsak harfler icin de olur
		
		if (sayi1>sayi2) { 
			
			for (int i = sayi1; i >=sayi2; i-=3) {
				
				System.out.print(i+" ");
				
			}
			
		} else if (sayi2>sayi1) {
			
			for (int i = sayi1; i <=sayi2; i+=3) {
				
				System.out.print(i+" ");
			}
		}else {
			
			System.out.println("Girilen sayilar esit!!!!");
		}
		
		scan.close();
	}

}
