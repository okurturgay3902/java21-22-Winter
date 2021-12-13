package day40_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// Verilen bir int array icin kullanicidan sayi isteyin ve
		// girilen sayiyi index olarak kabul edip o indexdeki
		// elemani yazdirin

		int arr[] = { 2, 3, 5, 6, 2, 7, 9, 1 };

		// verilen hatalari not aldik:
		// InputMismatchException
		// ArrayIndexOutOfBoundsException

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen elementi yazdirmak icin index giriniz");
			int index = scan.nextInt();

			System.out.println("girdiginiz index'teki eleman : " + arr[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiginiz index array'de yok");

		} catch (InputMismatchException e) {
			System.out.println("Girdiginiz index pozitif tam sayi olmali");
		}
		
		
	}

}
