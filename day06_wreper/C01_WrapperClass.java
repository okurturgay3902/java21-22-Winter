package day06_wreper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		// sayi1. yazdigimizda hic bir metod cikmaz, cunku sayi1 int'dir yani primitive

		// sayi2. yazdigimizda bir cok metod geliyor cunku Integer
		
		String tel1="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);
		
		// busayilari toplamamiz istenirse
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2)); //6824421
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		// String caddeNo= "B203";
		String caddeNo= "203";
		String sokakNo= "1564";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		
		 // Integer.valueOf(String numerik ifade) method'u string olarak kaydedilmis 
        // numerik ifadeleri sayiya cevirir
        // ancak String ifadede numerik olmayan bir karakter olursa
        // Java NumberFormatException hatasi verir ve calismayi durdurur
        // stops execution
        
        System.out.println("Hello world");
        
        int sayi=sayi1+sayi2;
        System.out.println(sayi);
        
        
	}

}
