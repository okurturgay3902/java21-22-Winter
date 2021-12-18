package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		
		System.out.println(ll); //[]
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll); //[5, 7]
		//linked list'in iki tane interface parenti vardir
		// birisi list, oteki de Deque==>Queue
		
		ll.addFirst(10);//queue interface den gelen ozellikle
		System.out.println(ll); //[10, 5, 7]
		ll.add(0, 11); //List interface den gelen ozellikle
		System.out.println(ll); //[11, 10, 5, 7]
		
		LinkedList<Integer> ll2=new LinkedList<>();
		
		ll2.addAll(ll);
		System.out.println(ll2); //[11, 10, 5, 7]
		
		ll2.addAll(2, ll);
		System.out.println(ll2); //[11, 10, 11, 10, 5, 7, 5, 7]

		
	
		
		
		
		

	}

}
