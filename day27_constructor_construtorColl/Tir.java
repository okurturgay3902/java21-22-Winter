package day27_constructor_construtorColl;

public class Tir {
	
	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;	

	public Tir(int i, String string, String string2, int j, boolean b) {
			//int km, String model, String renk, int yil, boolean satilikMi
		// Tir runner Classindan yolladigim degerlerin intance veriable lar ile
		//eslesmesi icin atamalari yapmaliyiz
		
		km=i;
		model=string;
		renk=string2;
		yil=j;
		satilikMi=b;
	}

	public Tir(int km, String model, String renk) {
		//public Tir(int i, String string, String string2)
		//  i, string, string2 isim olarak guzel isimler degil
		// kodumuzun sonradan incelenirken anlasilir olmasi icin
		//veriable isimlerini anlamli yapalim
		//int km, String model, String renk yapalim
		
		this.km=km;
		this.model=model;
		this.renk=renk;
		
		//Basina this. yazdigimizda Java bu veriable nin class level deki oldugunu anlar
		
		
		
		
	}

	

}
