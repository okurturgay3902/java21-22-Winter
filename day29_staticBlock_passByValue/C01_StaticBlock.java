package day29_staticBlock_passByValue;

public class C01_StaticBlock {
	
	static {
		System.out.println("Static blok ne zaman calisacak");
	}
	

	public static void main(String[] args) {
		System.out.println("Java once main metod calisir");
		
		/*cikti:
		 *  Static blok ne zaman calisacak
			Java once main metod calisir
		 */
	}	
	static {
			System.out.println("Static blok nereye yazilirsa yazilsin main metoddan once calisir");
		}

	// eger birden fazla ststic blok varsa Java yukaridakini daha once calistiriri
	}


