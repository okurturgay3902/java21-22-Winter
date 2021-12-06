package day09_NestedIf;

import java.util.Scanner;

public class C02_NestedIf {

	public static void main(String[] args) {
		//Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
		//Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin. 
		//Son rakamı 0 ise ekrana “5’e bolunen cift sayi” yazdırın.
		//Son rakamı 0 değil ise “5’e bolunen tek sayi” yazdırın.
		//Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
		
        if (sayi<1000 || sayi>9999) {
        	
        	System.out.println("4 basamakli sayi girmelisiniz");
			
		} else {
			
			if (sayi%5==0) { //5 e tam bolunenler
				
				if (sayi%10==0) {//son rakam sifir
					
					System.out.println("5 e tam bolunen cift sayi");
					
				} else {//son rakam 5
					
					System.out.println("5 e tam bolunen tek sayi");

				}
				
								
			} else {//5 e bolunemeyenler
				
				System.out.println("Tekrar Deneyin");

			}
			
			scan.close();
		}
	}

}
