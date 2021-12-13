package day40_exception;

public class C01_exception {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		
		try {
		System.out.println("Sayilarin bolumu : "+ a/b);
		} catch (ArithmeticException e) {
			System.out.println("Bolme isleminde payda SIFIR olamaz");
			// System.out.println(e.getMessage()); //  / by zero
			e.printStackTrace(); //java.lang.ArithmeticException: / by zero
								 //at day40_exception.C01_exception.main(C01_exception.java:11)
								 // Detayli Exception raporu yazdirmak icin
		}
		
		System.out.println("Gorev tamamlandi");
	}

}
/*  hata durumunda
 * try { bu islemi yapmaya calis}
 * catch (boyle bir hatayla karsilasirsan ) 
 * KODUN CALISMASINI DURDURMA
 * { BU ISLEMI YAP VE YOLUNA DEVAM ET}
 * 
 * 
 * Örnek Exception Türleri
Hata Tipleri    Hatanın Anlamı
ArithmeticException Aritmatiksel bir işlem sırasında oluşan hata 
ArrayIndexOutOfBoundsException  Array sınırlarından çıkılma hatası
ArrayStoreException Array yapısına uymayan bir değer kaydedilmeye çalışıldığında
ClassCastException  Uygunsuz class atama işlemi
IllegalArgumentException    Uygun olmayan argüman kullanımı
IllegalMonitorStateException    Uygun olmayan monitör işlemi
IllegalStateException   Sistemin uygun pozisyonda olmadığını belirtir
IllegalThreadStateException Tread durumunun uygun olmadığını belirtir
IndexOutOfBoundsException   Index'in sınırlardan çıkılma hatası
NegativeArraySizeException  Array'in boyutuna negatif değer verilmiş olması hatası
NullPointerException    Boş pointer hatası
NumberFormatException   Uygun olmayan sayı formatı hatası
SecurityException   Güvenlik hatası
StringIndexOutOfBounds  String yapısının sınırlarından çıkma hatası
UnsupportedOperationException   Desteklenmeyen işlem hatası
ClassNotFoundException  Class bulunmama hatası
CloneNotSupportedException  Çoğalmaya çalışılan bir objenin çoğalamayacağını belirten hata
IllegalAccessException  Uygunsuz erişim hatası
InstantiationException  Bir objenin oluşturulması esnasında oluşan hata
InterruptedException    Bir tread'in diğer tread'i durdurma hatası
NoSuchFieldException    Aranılan alanın olmadığı hatası
NoSuchMethodException   Kıllanılan methodun bulunmama hatası

*/