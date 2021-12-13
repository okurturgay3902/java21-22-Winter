package day40_exception;

import java.util.Scanner;

public class C08_IllagalArgumentException {

	public static void main(String[] args) {
		/* Kullanicidan yasini girmesini isteyin
		 * kullanici sifirdan kucuk bir sayi girerse 
		 * Exception verecek sekilde yazalim
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		try {
			if (yas<0) {
				throw new IllagalArgumentException();
			}else {
				System.out.println(yas);
			}
		}catch (IllagalArgumentException e) {
			
		}
	System.out.println("Gorev Tamam");	
	}

}
