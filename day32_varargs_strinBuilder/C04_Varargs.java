package day32_varargs_strinBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		KafanaGoreIslem(5,10,13,0);
		
		/*varargs da hic eleman olmasada java itiraz etmez
		 once int olarak tanimlanan sayilari eslestirir
		kalan tum sayilari varargs'a doldurur, varargs'in hic elemani olmaya bilir
		*/
	}

	private static void KafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar) {
			
		int toplam=0;
		
		for (int each : sayilar) {
			
			toplam+=each;
			
		}
		System.out.println("ilk sayi ile digerlerinin toplaminin carpimi : "+ sayi1*toplam);


	}

}
