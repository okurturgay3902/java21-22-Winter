package day17_forLoop;



public class C07_NestedForLoop {

	public static void main(String[] args) {
		// 1'den 4'e kadar sayilari yan yana aralarinda bir bosluk birakarak yazdiriniz
		
		//NestedForLoop icice forloop demek 
		
		
		for (int satir = 1; satir <=4; satir++) {
			
			for (int i = 1; i <=4; i++) {
				
				System.out.print(satir*i+" ");
		}
			System.out.println();
		}

	}

}
