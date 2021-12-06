package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		/* kullanicidan 100'den kucuk bir sayi isteyin
		1'den baslayarak girilen sayiya kadar 
		3'un kati olan sayilari yazdirin
		
		*/
		 //sayi negatif veya tamsayi degilse uyari verelim
		
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen 100'den kucuk bir sayi giriniz :");
        
        double num=scan.nextDouble();
        int sayi=(int) num;
        
        if (num<0) {
			System.out.println("Negatif sayi giremezsiniz");
		} else if (sayi!=num){
			System.out.println("Lutfen tamsayi giriniz");
			
		}else if (sayi>100){
			System.out.println("Lutfen 100'den kucuk sayi giriniz");
			
		}else    {
			
			for (int i = 1; i <= num; i++) {
	        	
	        	if (i%3==0) {
	        		
	        		System.out.print(i+" ");
					
				}
				
			}
			
		}
			
         
        
        
        scan.close();
	}

}
