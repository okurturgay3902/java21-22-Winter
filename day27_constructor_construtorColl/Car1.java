package day27_constructor_construtorColl;

public class Car1 {

	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;

	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
	}

	public Car1() {
		// CarRunner hata verdigi icin bir bos constructor yazdik
		// ben 5 ozelligi birden degistiren bir constructor urettigimizde
		// java default constructor'u siler (bu nedenle bos constructor yazdik)
		// bu durumda daha onceden yazilan ve default constructor coker
		// bu durumda kodlari duzeltmek icin Javanin sildigi default constructor
		// yerine parametresiz bir constructor olusturmaliyiz
		// parametresiz bir constructor uretmenin syntax'i(yolu) clasAdi+() +{}

	}

	public Car1(int i) {
		// Bu satirdaki int km ile class leveldeki int km farkli scope'lardadir
		km = i;

	}

	public Car1(int i, int j) {
		yil=i;
		km=j;
	}

	public void hiz(int hiz) {
		System.out.println("araba saatte " + hiz + "km yol yapar.");
	}

	public void yakit(String yakit) {
		System.out.println("araba yakit olarak " + yakit + " kullanir.");
	}
}
