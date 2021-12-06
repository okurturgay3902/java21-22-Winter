package day32_varargs_strinBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		
		topla(5,8,10,15,25,0);
		
		//varargs'dan once farkli parametreler kullanila bilir 
		//ama varargs'dan sonra parametre yazilamaz
		//yazarsaniz java varargs son parametre olmalidir diye sizi uyarir
		//ve CTE verir

	}

	private static void topla(int... sayilar) {
		int toplam=0;
		
		for (int each : sayilar) {
			
			toplam+=each;
			
		}
		System.out.println("Girilen sayilarin toplami : "+toplam);

	}

}
