package day13_stringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		str=str.replaceAll("\\d", "");
		
		System.out.println(str); //*Java ogrenmek c..ok kolay
		
		str=str.replaceAll("\\s", "x");
		
		str=str.replaceAll("\\W", "");
		
		System.out.println(str); //*  ..
		
		str=str.replaceAll("x", " ");
		
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
	}

}
