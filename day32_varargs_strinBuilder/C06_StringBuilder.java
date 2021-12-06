package day32_varargs_strinBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		String str="Ali Can";
		
		String str2=new String("Veli Cem");
		
		// StringBuilder sb= "Yasasin JAVA"; // String deki gibi basit olusturulamaz
		
		StringBuilder sb=new StringBuilder("Yasasin JAVA");
		
		sb.append("!!!");
		
		System.out.println(sb); //Yasasin JAVA!!!  atama yapmadik ama !!! geldi
		
		String sbBuyukHarf= sb.toString().toUpperCase();
		
		System.out.println(sbBuyukHarf); //YASASİN JAVA!!!
	}

}
