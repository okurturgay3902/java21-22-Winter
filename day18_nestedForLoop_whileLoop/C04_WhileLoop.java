package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		/* ForLoop ile yazilamayacak soru
		 * 
		 * kullanicidan toplamak uzere sayi isteyin 
		 * kullanici 0 a basincaya kadar sayilari alip 
		 * toplamaya devam edin
		 * kullanici sifira bastiginda 
		 * o ana kadar kac sayi girdigini ve girilen
		 *  sayilarin toplamini yazdirin
		 *  
		 *  
		 *  **kullanicidan x tane deger alin dese idi forLoop la ypilirdi
		 *  
		 */

		 Scanner scan =new Scanner(System.in);
		 
		 /*loop'un icinde kullanacagim obje ve veriable'lari
		  * loop'dan once olusturmak daha guzeldir
		  * cunku loop'un icinde olusturursak
		  * loop her dondugunde yeni bir obje veya veriable olusturur 
		  * ve bu da hafizayi doldurur.
		  */
		 
		 int sayi=100;
		 int toplam=0;
		 int sayac=0; 
		 
		 while (sayi!=0) {
			 
			 System.out.println("Lutfen toplama eklemek icin bir sayi giriniz\nbitirmek icin 0'a basin");
			 sayi=scan.nextInt();
			 toplam+=sayi;
			 sayac++;
			 
		}
		 //kullanici 0'a bastiginda loop islevini son kez yapip
		 //sonra basa donecek ve loop bitecek
	        
		 System.out.println("Girilen sayi adedi :"+(sayac-1)); //bitisteki 0'i saymasin diye
		 System.out.println("Girilen sayilarin toplami :"+toplam);
	        
	        
	        
	        
		scan.close();
	}

}
