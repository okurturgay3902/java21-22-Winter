package day17_forLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin. 
		//Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
		//sonucu yazdiran bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfeniki iki sayi girin \nilk sayidan sonra enter e basin");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int toplam=0;
		/*int kucuk=0;
		int buyuk=0;
		
		
		if (sayi1>sayi2 ) {
			
			buyuk=sayi1;
			kucuk=sayi2;	
			
		}else {
			buyuk=sayi2;
			kucuk=sayi1;
		}
		
		for (int i =kucuk ; i <= buyuk; i++) {
			
			toplam+=i;
			
		}
		
		System.out.println(kucuk +"'den " +buyuk+ " e kadar sayilarin toplami= "+toplam);
	*/
		if (sayi1>=sayi2 ) {
			
			for (int i =sayi2 ; i <= sayi1; i++) {
				
				toplam+=i;
						
			}
			
		}else {
			for (int i =sayi1 ; i <= sayi2; i++) {
				
				toplam+=i;
				
		
		}
			System.out.println(sayi1 +"'den " +sayi2+ " e kadar sayilarin toplami= "+toplam);
		
	scan.close();
	}
	}
}
