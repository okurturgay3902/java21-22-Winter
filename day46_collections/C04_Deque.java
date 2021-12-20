package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		Deque<String> ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		
		System.out.println(ciftBasli); //[Yildiz, Ali]  add() Queue'den geldiginden sona ekler
		
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli); // [Yildiz, Ali, Emine]  Deque den gelen ozellik
		
		System.out.println(ciftBasli.pop());// Yildiz
		System.out.println(ciftBasli); // [Ali, Emine]
		
		ciftBasli.push("Kemal");
		System.out.println(ciftBasli); //[Kemal, Ali, Emine]
		
		ciftBasli.add(null);
		System.out.println(ciftBasli); //[Kemal, Ali, Emine, null]
		
		ciftBasli.addFirst(null);
		System.out.println(ciftBasli); //[null, Kemal, Ali, Emine, null]

	}

}
