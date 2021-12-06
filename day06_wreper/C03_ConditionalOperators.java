package day06_wreper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
		
		System.out.println(5+2<7); //false
		
		System.out.println(5*2<15); //true
		
		int saonuc1=10;
		
		boolean sonuc1=(5+2)==7;
		
				System.out.println(sonuc1); //true
				
		System.out.println(5+3==8 || 6+5==10 || 7-2==3); //true
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3); //false
		
		
		int a=10;
		int b=20;		
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c;
		
		System.out.println(sonuc); //true
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3); //false ilk yanlisi bulunca sonucu yazar
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3); //false butun islemi yapinca sonucu yazar
														//cok calisisr
		
		
		
	}

}
