package day10_ternary_SwithCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve tek veya cift oldugunu yazdirin
		
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();
        
        System.out.println((sayi%2==0) ? "cift sayi" : "tek sayi");
        
        scan.close();

	}

}
