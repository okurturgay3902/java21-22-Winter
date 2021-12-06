package day07_IfSteatment;

import java.util.Scanner;

public class C05_IfUygulama {

	public static void main(String[] args) {
		// Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
		// eger uc kenar uzunlugu birbirine esit ise ekrana "Eskenar ucgen"
		//diger durumlarda ekrana "Eskenar ucgen degil" yazdir
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen ucgenin birinci kenarinin uzunlugunu giriniz");
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen ucgenin ikinci kenarinin uzunlugunu giriniz");
		double kenar2=scan.nextDouble();
		
		System.out.println("Lutfen ucgenin ucuncu kenarinin uzunlugunu giriniz");
		double kenar3=scan.nextDouble();
		
		/* if (kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("Eskenar ucgen");
			
		}
		
		if (kenar1 != kenar2 || kenar1 != kenar3 || kenar2!= kenar3) {
				System.out.println("Eskenar ucgen degildir");	
			
			}
		*/
		if (kenar1==kenar2 && kenar1==kenar3) {System.out.println("Eskenar ucgen");} else 
		{System.out.println("Eskenar ucgen degildir");

		} 	
		scan.close();	
		} 
		
	}


