package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		/* Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		 * Kullanici 2,3 veya 4 degerini girerse, 
		 * kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
		 *  Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		 *   “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen toplamak istediginiz sayi adetini 2,3 veya 4 den biri olarak secin");
        int tercih=scan.nextInt();
        		
        if (tercih>4) {
			tercih=5;
		}		
        switch (tercih) {
		case 2:
			ikiSayiTopla();
			break;
		case 3:
			ucSayiTopla();
			break;
		case 4:
			dortSayiTopla();
			break;
		case 5:
			System.out.println("cok sayi girdiniz, ben toplayamam");
			break;
		
		default:
			System.out.println("Gecersiz Tercih");
		}
		scan.close();
	}

	public static void dortSayiTopla() {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen toplamak istediginiz dort sayiyigirin "
        		+ "\nhersayidan sonra entere basiniz ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();
        double sayi4=scan.nextDouble();
        
        System.out.println("Girdiginiz 4 sayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));
        scan.close();
		
	}

	public static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen toplamak istediginiz uc sayiyigirin "
        		+ "\nhersayidan sonra entere basiniz ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();
        
        System.out.println("Girdiginiz 3 sayinin toplami : "+(sayi1+sayi2+sayi3));
        scan.close();
		
	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen toplamak istediginiz iki sayiyigirin "
        		+ "\nhersayidan sonra entere basiniz ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        
        System.out.println("Girdiginiz 2 sayinin toplami : "+(sayi1+sayi2));
        scan.close();
		
	}

}
