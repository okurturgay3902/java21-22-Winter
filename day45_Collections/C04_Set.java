package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_Set {

	public static void main(String[] args) {
		
		
		Set<Object> s1=new HashSet<>(); //Object yaptigimiz icin herseyi ekleyebiliriz
										// teknik olarak mumkun ancak kullanmak, islem yapmak zor
		
		s1.add(4);
		s1.add(17);
		s1.add(11);
		
		System.out.println(s1);// [17, 4, 11] sirali yazdirmaya bilir
		
		s1.add("Java Candir");
		System.out.println(s1); //[17, 4, Java Candir, 11]
		
		
		
		
		List<Object> liste=new ArrayList<>();
		
		liste.add(5);
		liste.add("Java super");
		liste.add(true);
		liste.add('x');
		liste.add(s1);
		
		System.out.println(liste); //[5, Java super, true, x, [17, 4, Java Candir, 11]]
		
		
	}

}
