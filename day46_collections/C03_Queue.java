package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		//FIFO  ilk gelen ilk cikar Gelen sona gelir silinen bastan silinir
		
		Queue <String> kuyruk= new LinkedList<>();
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk); // [Lutfullah, Mustafa, Ridvan]
		
		kuyruk.remove();
		System.out.println(kuyruk); // [Mustafa, Ridvan]
		
		kuyruk.remove();
		System.out.println(kuyruk); // [Ridvan]
		
		kuyruk.add("Hakan");
		kuyruk.add("Hasan");
		kuyruk.add("Ridvan");
		System.out.println(kuyruk);//[Ridvan, Hakan, Hasan, Ridvan]
		
		kuyruk.remove("Hasan");
		System.out.println(kuyruk); //[Ridvan, Hakan, Ridvan]
		
		
		
	
	}

}
