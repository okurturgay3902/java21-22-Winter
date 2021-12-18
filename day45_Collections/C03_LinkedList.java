package day45_Collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		
		System.out.println(ll); //[]
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll); //[5, 7]
		
		ll.element();
		System.out.println(ll.element());//5 ilk elemani getirdi
		
		
		ll.peek();//elemani getirir ama silmez
		System.out.println(ll.peek());// 5 ilk elemani getirdi
		System.out.println(ll.peekFirst());// 5 ilk elemani getirdi
		
		ll.poll(); //elemani getirir ve siler
		
		LinkedList<Integer> ll2=new LinkedList<>();
		
		System.out.println(ll2.peekFirst());//null eleman olmadigi icin
		System.out.println(ll2.peek());//null eleman olmadigi icin
		// System.out.println(ll2.element());  ilk eleman olmadigi icin hata firlatir
		
		System.out.println(ll.poll()); // 7 yi getirdi ve sildi
		System.out.println(ll); // []
		System.out.println(ll.poll());//null eleman olmadigi icin
		
		System.out.println(ll.hashCode()); // 1  java'nin verdigi hash code'u verir
		
		ll2.add(9);
		System.out.println(ll2.hashCode());// 40  java'nin verdigi hash code'u verir
		
		System.out.println(ll2.offer(55)); //true 55 ekledini bildirdi
		System.out.println(ll2); //[9, 55]
		
		
		ll2.push(6); //add.First ile ayni
		System.out.println(ll2);//[6, 9, 55]
		
		
		

	}

}
