package day26_forEachLoop_constructor;

public class JeepRunner {

	public static void main(String[] args) {
		// jeep class indan bir obje olusturalim ve ozelliklerini yazdiralim
		
		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiat+" "+jeep1.ilanNo+" "+ jeep1.marka+" "+
							jeep1.model+" "+ jeep1.yil);
		//jeep class indaki veriable lar instance veriablelar olduklarindan 
		// atadigim degerler sadece benim objem icin degerleri degistirir
		// jeep class indaki degerlere hic bir sey yapmaz
		
		jeep1.fiat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.yil=2005;
		
		System.out.println(jeep1.fiat+" "+jeep1.ilanNo+" "+ jeep1.marka+" "+
				jeep1.model+" "+ jeep1.yil);		
		
		jeep1.hiz(150);
		jeep1.yakit("benzin");
		

	}

}
