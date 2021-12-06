package day23_multiDimensionalArrays;

public class C04_MDArrays {

	public static void main(String[] args) {
		/*
		 * Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son
		 * elemanlarin carpimini ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5},
		 * {6} }
		 */

		int arr[][] = { { 1, 2, 3, 4 }, { 4, 5, 2 }, { 6, 1 }, };

		int sonuc = 1;

		for (int i = 0; i < arr.length; i++) {

			sonuc *= arr[i][arr[i].length - 1];

		}

		System.out.println(sonuc);

	}

}
