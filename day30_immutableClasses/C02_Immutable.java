package day30_immutableClasses;


public class C02_Immutable {

	public static void main(String[] args) {
		String str="Ali";
		
		for (int i = 0; i < 100; i++) {
			str+=" ";
		}
		
		// kod calistiginda java kac obje olusturur?
		//101;  bir obje basta + loopda 100 adet
		// str in son degeri "Ali....(100 tane bosluk)..)

	}

}
