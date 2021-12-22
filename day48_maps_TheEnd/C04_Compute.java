package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
		
		Map<String, Integer> ornek=new HashMap<>();
		
		ornek.put("A", 2);
		ornek.put("B", 5);
		ornek.put("C", 1);
		ornek.put("Z", 3);
		ornek.put("K", 10);
		
		System.out.println(ornek); //{A=2, B=5, C=1, Z=3, K=10}
		
		ornek.compute("A",(key,value)->10);
		System.out.println(ornek); //{A=10, B=5, C=1, Z=3, K=10}
		
		ornek.compute("B",(key,value)->2*value+5);
		System.out.println(ornek); //{A=10, B=15, C=1, Z=3, K=10}
		
		ornek.computeIfAbsent("D", v->20); // olmadigi icin ekledi
		System.out.println(ornek); //{A=10, B=15, C=1, D=20, Z=3, K=10}
		
		ornek.computeIfAbsent("C", v->25); //C oldugu icin eklemez
		System.out.println(ornek); //{A=10, B=15, C=1, D=20, Z=3, K=10}
		
		ornek.computeIfPresent("K", (key,value)->2*value+5);
		System.out.println(ornek); //{A=10, B=15, C=1, D=20, Z=3, K=25}

	}

}
