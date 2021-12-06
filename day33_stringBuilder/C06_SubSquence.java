package day33_stringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		
		System.out.println(sb.substring(14)); //kolay   string dondurur
		
		System.out.println(sb.subSequence(14, 19)); //kolay  bu subSquence 
		
		System.out.println(sb);//Java ne kadar kolay atama yapilmamis
		
		/* ikiside ayni sonucu dondurur ancak Substring metodu
		 * String class indan geldigi icin ardindan String metodlarini 
		 * kullanabiliriz
		 * ancak subSequence kullandigimda bu mumkun degil
		 */
		
		
		
		
	
	}

}
