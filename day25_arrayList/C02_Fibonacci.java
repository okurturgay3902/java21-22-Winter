package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {
		/*
		 * verilen bir sayidan kucuk Fibonacci sayilarini bir list olarak kaydedin
		 * 
		 * 1,1,2,3,5,8,13,21,34,55,89,144,...
		 */

		int sinir = 10000;

		List<Integer> fibonacci = new ArrayList<>();

		fibonacci.add(1);
		fibonacci.add(1);
		int sayi = 0;
		while (sayi < sinir) {
			sayi = fibonacci.get(fibonacci.size() - 2) + fibonacci.get(fibonacci.size() - 1);
			fibonacci.add(sayi);
		}

		// System.out.println(fibonacci); // son sayi siniri asti icin son sayiyi cikardik
		fibonacci.remove(fibonacci.size() - 1);

		System.out.println(fibonacci);

	}

}
