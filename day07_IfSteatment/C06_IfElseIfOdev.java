package day07_IfSteatment;

import java.util.Scanner;

public class C06_IfElseIfOdev {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan gun ismini yazmasini isteyin. 
		// Girilen isim gecerli bir gun ise gun

		// isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin,
		//gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birgun ismi yaziniz");
        
        String gun=scan.next().toLowerCase();
        
        if (gun.equals("pazar") || gun.equals("cumartesi")||gun.equals("cuma")||gun.equals("persembe")||
        		gun.equals("carsamba")||gun.equals("sali")||gun.equals("pazartesi")) {
            System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1));} else {
            System.out.println("Gecerli gun ismi giriniz");
            }
        scan.close();
	}

}
