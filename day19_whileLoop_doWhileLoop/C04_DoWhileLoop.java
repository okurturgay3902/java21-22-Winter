package day19_whileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		
		
		int i=0;
		
		while (i<5) {
			System.out.print(i+" "); //0 1 2 3 4
			i++;
			
		}
		/*while loop once kontrol eder sonra kodu calistirir
		 * loop icinde artis yapilsa da bir sonraki kontrole kadar 
		 * calismaya devam eder bu da bazi durumlarda 
		 * hatali sonuclara ulasmamiza sebep OLABILIR	
		 * 
		 * 
		 * do while loop ise once islemi yapar ve sonra sarti kontrol eder 
		 * ozellikle kullanicidan deger almalarda do while loop tercih edilir.
		 */
		
		
		int a=0;
		
		do {
			System.out.print(i+" ");
			a++;
		} while (a<5);
	}

}
