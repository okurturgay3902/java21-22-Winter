package day18_nestedForLoop_whileLoop;

public class C03_WhileLoop {

	public static void main(String[] args) {
		/* 20'den 30'a kadar olan sayilari
		    while ile yazdirin
		    
		    ******
		    *for loop ile cozulecek sorulari while loop ile cozmek kodumuzu uzatabilir.
		*/
		
		for (int i = 20; i <=30; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		int sayi=20;
		while (sayi<=30) {
			System.out.print(sayi+" ");
			sayi++;
			
		}
		

	}

}
