package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin 
		// sayilarin karelerini ve kuplerini toplayip yazdiran metod yazin
		//kullaniciya us sorun 
		// 2 yazarsa kareler toplami, 3 yazarsa kupler toplami
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfeniki iki sayi girin \nilk sayidan sonra enter e basin");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Girilen sayilarin kareler toplamini istiyorsaniz 2"
				+"\nkupler toplamini istiyorsaniz 3 e basiniz");
		
		int secim=scan.nextInt();
		
		switch (secim) {
		case 2:
			kareTopla(sayi1,sayi2);
			break;
		case 3:
			kupTopla(sayi1,sayi2);
			break;

		default:
			System.out.println("lutfen istenen tercihlerden birini girin");
			
		}
		
		
		
		
		// kareTopla(sayi1,sayi2); bunu metodu olusturmak icin yazmistik sildik
		
		// kupTopla(sayi1,sayi2); bunu metodu olusturmak icin yazmistik sildik
		/*
		 * bir metod u 4 adimda olusturunuz
		 * 1-method'ujavaya olusturabilmek icin method call yapiyoruz
		 *2-arguman ihtiyaci varmi belirleyelim
		 *3- javadan yardim alarak method olusturalim
		 *4-axcess modifier ve return type karar ver
		 *bundan sonra metodun yapacagi isleri gerceklestirecek kodlari yazariz
		 */
		
		scan.close();
	}

	public static void kupTopla(double sayi1, double sayi2) {
		
		double kuplerToplami=sayi1*sayi1*sayi1 + sayi2*sayi2*sayi2;
		System.out.println("Girilen sayilarin kupler toplami : "+kuplerToplami);
		
	}

	public static void kareTopla(double sayi1, double sayi2) {
		// bizim arguman isimlerimizle, parametre isimlerimiz ayni olmak zorunda degil
		//java isimlere degil degerlere bakar
		
		double karelerToplami=sayi1*sayi1+ sayi2*sayi2;
		System.out.println("Girilen sayilarin kareler toplami"+karelerToplami);
		
		
		
	}

}
