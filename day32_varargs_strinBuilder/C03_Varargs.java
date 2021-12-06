package day32_varargs_strinBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		
		KafanaGoreTopla(5,8,10,15,25,0);
		
		//varargs list gibi davranir ama array methodlari ile calisir

	}

	private static void KafanaGoreTopla(int sayi1, int... sayilar) {
			
		int toplam=0;
		
		for (int each : sayilar) {
			
			toplam+=each;
			
		}
		System.out.println("ilk sayi ile digerlerinin toplaminin carpimi : "+sayi1*toplam);

	}

}
