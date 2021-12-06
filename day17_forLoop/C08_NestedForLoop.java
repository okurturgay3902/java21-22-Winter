package day17_forLoop;

public class C08_NestedForLoop {

	public static void main(String[] args) {
		// *
		// * *
		// * * *
		// * * * *  seklini yazdir
		
		
		for (int satir = 1; satir <=4; satir++) {
			
			for (int i = 1; i <=satir; i++) {
				
				System.out.print("*"+" ");
		}
			System.out.println();
		}

	}

}
