package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false 
		// sb'de equals metodu Stringdeki mantikla calismaz,
		//== mantigi ile calisir
		
		System.out.println(sb1.compareTo(sb2));//0
		/*Ilk harflerden baslayarak bire bir sb'leri karsilastirir
		 * eger tum karekterler ayni ise sonuc olarak 0 doner
		 * ilk buldugu farkli karektere bakar ilk yazilan sb, ikinciden 
		 * kac karekter onde veya geride onu dondurur
		 * 
		 * eger iki sb'in esit olup olmadigini anlamak istersek
		 * if (sb1.compareTo(sb2)==0) ile bakabiliriz 
		 */
		
		String str="Java";
		// System.out.println(sb1==str); Incompatible operand types StringBuilder and String
										// yani karsilastiramaz
		
		System.out.println(sb1.equals(str)); // false
		// System.out.println(sb1.compareTo(str)); compare str icin kullanilamaz
		
		// System.out.println(sb1=="Java"); buda olmadi
		System.out.println(sb1.equals("Java")); //false
		// System.out.println(sb1.compareTo("Java")); buda olmadi
		
		
	}

}
