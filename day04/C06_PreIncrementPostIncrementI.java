package day04;

public class C06_PreIncrementPostIncrementI {

	public static void main(String[] args) {
	
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi); //13
		
		System.out.println(sayi++); //13	once yazdirdi sonra atama
		
		System.out.println(sayi); //14
		
		System.out.println(++sayi); //15
		
		System.out.println(sayi--); //15
		
		System.out.println(sayi);// 14
						
		System.out.println(--sayi);//13

	}

}
