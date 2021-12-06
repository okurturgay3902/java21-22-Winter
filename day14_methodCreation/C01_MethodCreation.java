package day14_methodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// verilen iki sayinin toplamini ve carpimini yapip yazdiran 
		// ve yazdiran iki ayri metod olustururn
		
		//metod olusturmak icin 3 adim takip edelim
		//1. adim method call yazalim
		//2. adim methoda arguman yazacakmiyiz karar vermeliyiz
		
		
		int sayi1=4;
		int sayi2=5;		
		
		toplama(sayi1,sayi2); // method call
		
		//3. adim: 1. adim ve 2. adimi yaptiktan sonra  java dan yardim alip method olustururuz
		
		carpma(sayi1,sayi2); //metod call

	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi : "+sayi1*sayi2);
		
	}

	public static void toplama(int sayi1, int sayi2) {
		//4. adim erisim duzenleyici ve return type karar vermeliyiz
		//erisim duzenleyici axcess modfier : public yaptik
		//return type: bizden sadece yazdirma istedigi icin void kalabilir
		
		System.out.println("sayilarin toplami : "+(sayi1+sayi2));
		
	}

}
