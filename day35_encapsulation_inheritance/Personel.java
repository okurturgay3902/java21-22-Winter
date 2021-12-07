package day35_encapsulation_inheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	/* Eger veriablelara access modifier yazmazsak
	 * java access modifier olarak default acc. mod. atar
	 * boyle olursa sadece o package altindaki child class'lar
	 * Personel class'ini inherit edebilir
	 * Baska package'lardaki child class'larin da Personel'i inherit edebilmesi icin
	 * veriable ve method'larin acc. modifier'larini protected yapariz
		public yapsak da inherit edilebilir ama biz herkesin erismesini degil
		sadece child clas'larin erismesini istedigimizden protected tercih ederiz
	 */
	
	public static void main(String[] args) {
		

	}

}
