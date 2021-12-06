package day09_NestedIf;

import java.util.Scanner;

public class C07_ArtikYil {

	public static void main(String[] args) {
		 // soru 10-Kullanicidan artik yil olup olmadigini
        // kontrol etmek icin yil girmesini isteyin.
        Scanner ekran = new Scanner(System.in);
        System.out.println("Lütfen bir tarih giriniz..:");
        int tarih = ekran.nextInt();
        if (tarih % 100 != 0) {
            if (tarih % 4 != 0) {
                System.out.println("girilen tarih \"" + tarih + "\" artık yıl degildir.");
            } else {
                System.out.println("girilen tarih \"" + tarih + "\" artık yıldır.");
            }
        } else if (tarih % 400 != 0) {
            System.out.println("Girilen tarih \"" + tarih + "\" artık yıl ddegildir.");
        } else {
            System.out.println("Girilen tarih \"" + tarih + "\" artık yıldır.");
        }
        
   ekran.close();
    }
	
	}

