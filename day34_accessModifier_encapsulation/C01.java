package day34_accessModifier_encapsulation;

public class C01 {
	
	private int sayiPrivate=10;
	//private class uyelerine sadece icinde bulundugu class'dan ulasabiliriz
	
	int sayiDefault=20;
	// default class uyelerine sadece icinde bulundugu package den ulasilabilir
	// default access modifier'in diger ismi de package access modifier'dir
	
	protected int sayiProtected=30;
	//protected class uyelerine icinde bulundugu package'daki tum class'lar
	// ve baska package'lerdeki child class'lar ulasabilir
	
	public int sayiPublic=40;
	//public class uyelerine tum package'lerdeki tum class'lardan ulasilabilir

	public static void main(String[] args) {
		
		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
	}
	
	
	public void staticOlmayanMethod() {
		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
	}

}
