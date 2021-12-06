package day19_whileLoop_doWhileLoop;

import java.util.Iterator;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		// 'm' harfinden baslayarak 'c' harfine kadar tum harfleri yazdirin.
		
		
		System.out.println("******for loop******");
		for (char i = 'm'; i >'c'; i--) {
			System.out.print(i+" ");
		}

		
		System.out.println(); //satir atlatmak icin
		
		
		
		System.out.println("******while loop******");
		char krk='m';
		
		while (krk>'c') {
			System.out.print(krk+ " ");
			krk--;
		}
		System.out.println();//satir atlatmak icin
		
		
		
		
		System.out.println("******do while loop******");
		char harf='m';
		
		do {
			System.out.print(harf+" ");
			harf--;
		} while (harf>'c');
		
		
		
	}

}
