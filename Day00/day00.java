package Day00;

import java.util.Scanner;

public class day00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	       System.out.println("Lutfen bir tam sayi yaziniz");
	       int sayi=scan.nextInt();
	       
	       tekMiCiftmiYazdir(sayi);
	       sifirlaKarsilastir(sayi);
	       istenenBasamaklariYazdir(sayi);
	       
	       scan.close();
	   }
	   public static void istenenBasamaklariYazdir(int sayi) {
	       
	       if (sayi<100) {
	           System.out.println("girdiginiz sayinin birler basagi : " + (sayi%10));
	       } else { // sayi 100'den buyuk  455254
	           
	           int rakamlarToplami=0;
	           int rakam=0;
	           // tdtszrs23
	           rakam=sayi%10;  //4
	           rakamlarToplami+=rakam; //4
	           sayi/=10; // 45525
	           
	           rakam=sayi%10; // 5
	           rakamlarToplami+=rakam; // 9
	           sayi/=10; // 4552
	           
	           rakam=sayi%10; // 2
	           rakamlarToplami+=rakam; // 11
	           
	           System.out.println("sayinin birler,onlar ve yuzler basamagindaki rakamlar toplami : " + rakamlarToplami);
	       }
	       
	   }
	   public static void sifirlaKarsilastir(int sayi) {
	       if (sayi>0) {
	           System.out.println("girilen sayi pozitif");
	       } else if (sayi<0) {
	           System.out.println("girilen sayi negatif");
	       } else {
	           System.out.println("0 sayisi pozitif yada negatif degildir");
	       }
	       
	   }
	   public static void tekMiCiftmiYazdir(int sayi) {
	       
	       if (sayi%2==0) {
	           System.out.println("Girilen sayi cift bir sayidir");
	       }else {
	           System.out.println("Girilen sayi tek bir sayidir");
	       }
	  
	}

}
