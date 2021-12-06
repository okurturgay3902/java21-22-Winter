package day33_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java candir can");
		
		sb.deleteCharAt(11);// sadece 11. karekteri siler		
		System.out.println(sb);//Java candircan
		
		sb.delete(11, 14);
		System.out.println(sb);//Java candir
		sb.delete(11, sb.length());
		
		sb.delete(5, 20);
		System.out.println(sb);//Java
		
		
		
		
		
		

	}

}
