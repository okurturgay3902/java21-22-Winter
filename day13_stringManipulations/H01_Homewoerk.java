package day13_stringManipulations;

public class H01_Homewoerk {

	public static void main(String[] args) {
		// Soru 1) String methodlarini kullanarak “  Java ogrenmek123 Cok guzel@  ”  
				// String’ini “Java ogrenmek cok guzel.” sekline getirin.


				String cumle="  Java ogrenmek123 Cok guzel@  ";
				cumle=cumle.trim();
				cumle=cumle.replaceAll("\\s", "x");
				System.out.println(cumle); //Javaxogrenmek123xCokxguzel@
				
				cumle=cumle.replaceAll("\\W", "");
				System.out.println(cumle); //Javaxogrenmek123xCokxguzel
				
				cumle=cumle.replaceAll("\\d", "");
				System.out.println(cumle); //JavaxogrenmekxCokxguzel
				
				cumle=cumle.replace("x", " ");
				System.out.println(cumle);//Java ogrenmek Cok guzel

	}

}
