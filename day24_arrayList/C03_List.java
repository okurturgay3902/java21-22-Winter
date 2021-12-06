package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C03_List {

	public static void main(String[] args) {
		// / Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin

		int arr[] = { 3, 4, 5, 6, 3, 5, 8, 3, 4, 9 };
		System.out.println("Orjinal Array :" + Arrays.toString(arr));
		
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Arraydan silmek istediginiz sayiyi giriniz");
        int silinecekEleman=scan.nextInt();
		
		Arrays.sort(arr);
		
		if (Arrays.binarySearch(arr, silinecekEleman)>=0) {
			List<Integer> gecici = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != silinecekEleman) {
					gecici.add(arr[i]);

				}
			}
			System.out.println("list olarak  :" + gecici); 
			/* list olarak istenmeyen eleman haric tum elemanlari goruruz
			 Sonucu array olarak istiyorum
			 listedekileri yeni arr e ekleyebiliriz
			 
			 */

			int yeniArray[] = new int[gecici.size()];

			for (int i = 0; i < yeniArray.length; i++) {

				yeniArray[i] = gecici.get(i);

			}
			// yeni arrayimimizi yazdiralim
			System.out.println("Array olarak :" + Arrays.toString(yeniArray));
			
		} else { 
			System.out.println("Silmek istediginiz eleman Arrayda mevcut degil.");
		}
		
		

		
		
		
		scan.close();
	}

}
