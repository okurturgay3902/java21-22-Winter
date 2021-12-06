package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {
		
		int sayilar[]= {3,4,5,6};
		
		elemanDegistir(sayilar);
		System.out.println("eleman degistir metodundan sonra :"+Arrays.toString(sayilar));//[10, 4, 5, 6]
		
		arrayDegistir(sayilar);
		System.out.println("Arraysi degistir metodundan sonra :"+Arrays.toString(sayilar));//[10, 4, 5, 6]

	}

	private static void arrayDegistir(int[] sayilar) {
		sayilar=new int[6];
		System.out.println("Arraysi degistir metodunda :"+Arrays.toString(sayilar));//[0, 0, 0, 0, 0, 0]
		
	}

	private static void elemanDegistir(int[] sayilar) {
		sayilar[0]=10;
		System.out.println("eleman degistir metodunda :"+Arrays.toString(sayilar)); //[10, 4, 5, 6]
		
	}

}
