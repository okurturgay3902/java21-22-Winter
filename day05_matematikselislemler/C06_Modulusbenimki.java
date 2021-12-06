package day05_matematikselislemler;

import java.util.Scanner;

public class C06_Modulusbenimki {

	public static void main(String[] args) {
		
		//kullanicidan 3 basamakli bir sayi alip
		//rakamlar toplamini yazdiran
		//bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 3 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
				
		int rakamlarToplami=0;
		
		int rakam1=sayi%10;
		
		int rakam2=(sayi%100-sayi%10)/10;
		
		int rakam3=(sayi%1000-sayi%100)/100;
		
		rakamlarToplami=rakam1+rakam2+rakam3;
		
		System.out.println("Verilen sayinin rakamlar toplami = " +rakamlarToplami);
		
		scan.close();
		
		

	}

}
