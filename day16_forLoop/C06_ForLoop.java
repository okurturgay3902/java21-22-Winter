package day16_forLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		/* Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin.
		 *  1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan
		 *   sayilari yazdirin.
		 */

		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen 100'den kucuk bir sayi giriniz :");
        
        int num=scan.nextInt();
        
        if (num>100 || num<0) {
            System.out.println("Gardaş sevdiğinin hatırına ne 100den  büyük ne negatif sayı girme");
        } else {
        			
			for (int i = 1; i <= num; i++) {
	        	
	        	if (i%3==0 || i%5==0) {
	        		
	        		System.out.print(i+" ");
					
				}
			}
			}
        
        scan.close();
	}

}
