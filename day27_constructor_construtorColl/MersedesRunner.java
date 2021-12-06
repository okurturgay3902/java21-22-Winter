package day27_constructor_construtorColl;

public class MersedesRunner {

	public static void main(String[] args) {
		
		Mersedes E280=new Mersedes(5000, 2016, "siyah", 3000, "sedan" );
		
		System.out.println("Araciniz "+E280.yil+ " Model "+E280.km+"km'de "+E280.renk+" "+E280.motor+""
				+ " motor "+E280.kasa+" kasa bir Mercedes hayirli olsun.");
		//Araciniz 2016 Model 5000km'de siyah 3000 motor sedan kasa bir Mercedes hayirli olsun.
		
		
		Mersedes E290=new Mersedes(60000, 2009, "beyaz");
		System.out.println("Araciniz "+E290.yil+ " Model "+E290.km+"km'de "+E290.renk+" "+E290.motor+""
				+ " motor "+E290.kasa+" kasa bir Mercedes hayirli olsun.");
		//Araciniz 2009 Model 60000km'de beyaz 0 motor null kasa bir Mercedes hayirli olsun.
		
		
		E280.km=15000;
		E280.yil=2010;
		E280.renk="kirmizi";
		E280.motor=3200;
		
		System.out.println("Araciniz "+E280.yil+ " Model "+E280.km+"km'de "+E280.renk+" "+E280.motor+""
				+ " motor "+E280.kasa+" kasa bir Mercedes hayirli olsun.");
		//Araciniz 2010 Model 15000km'de kirmizi 3200 motor sedan kasa bir Mercedes hayirli olsun.
		
	}

}
