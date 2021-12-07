package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		/*
		 * Soru 6: kullanicidan bir sayi alin
		 * ve bu sayiyi tam bolen sayilari ve 
		 * kactane olduklarini ekrana yazdiralim
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bolenlerini bulmak icin pozitif bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.print(bolen+", ");
				sayac++;
				
			}
			bolen++;
		}
		System.out.println();
		System.out.println(sayi+"'sayisinin tam bolen sayisi :"+sayac);
		
		
		scan.close();
		
	}

}