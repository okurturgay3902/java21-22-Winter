package day10_ternary_SwithCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kullanicidan bir sayi alin. Sayi pozitifse "sayi pozitif"yazdirin
		// negatifse sayinin karesini yazdirin
		
				Scanner scan = new Scanner(System.in);
		        
		        System.out.println("Lutfen bir sayi giriniz");
		        double sayi=scan.nextDouble();
		        
		        System.out.println((sayi>0) ? "Sayi pozitif" : sayi*sayi);
		        

    scan.close();
	}

}
