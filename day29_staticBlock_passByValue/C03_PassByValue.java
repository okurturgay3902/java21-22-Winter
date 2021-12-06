package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// 100 tl ye satilan bir urun icin 2 farkli
		// indirim uygulayan iki metod olusturalim
		
		/*Main methodan diger method'lara veya diger method'lardan main method'a
		 * bir veriable gonderirseniz Java orjinal veriable'lari degil
		 * onlarin degerlerini (value) goturur, orjinal veriable'in degeri degismez	
		 */

		int fiyat = 100;

		System.out.println(indirimYap25(fiyat)); // 75
		System.out.println("method'dan sonra main method'daki fiyat :" + fiyat); // 100

		fiyat = indirimYap10(fiyat); // indirimi kalici yapmak icin main method da atama yapmaliyiz

		System.out.println("method'dan sonra main method'daki fiyat :" + fiyat); // 90

	}

	private static int indirimYap25(int fiyat) {
		fiyat *= 0.75;

		return fiyat;
	}

	private static int indirimYap10(int fiyat) {
		fiyat *= 0.90;

		return fiyat;

	}

}
