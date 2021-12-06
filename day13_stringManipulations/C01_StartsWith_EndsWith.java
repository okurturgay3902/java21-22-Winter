package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime alin
		//verilen cumlenin verilen kelime(char aquence) ile baslayip baslamadigini 
		// ve bitip bitmedigini kontrol edin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");		
		String cumle=scan.nextLine();
				
		System.out.println("Lutfen bir kelime giriniz");		
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("Cumle"+ kelime+" ile basliyor");
		} else {
			System.out.println("Cumle "+ kelime +" ile baslamiyor");

		}
		if (cumle.endsWith(kelime)) {
			System.out.println("Cumle "+ kelime+ " ile bitiyor");
		} else {
			System.out.println("Cumle "+ kelime+ " ile bitmiyor");

		}
		
		scan.close();
	}

}
