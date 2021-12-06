package day27_constructor_construtorColl;

public class Mersedes {
	
	
	
	int yil = 2000;
	String renk;
	String model;
	int km;
	String kasa;
	int motor;
	
	public Mersedes(int km, int yil, String renk, int motor, String kasa) {
		
	this.km=km;
	this.yil=yil;
	this.renk=renk;
	this.motor=motor;
	this.kasa=kasa;
	
	
	
	}

	public Mersedes(int i, int j, String string) {
		
		km=i;
		yil=j;
		renk=string;
		
		
	}

}
