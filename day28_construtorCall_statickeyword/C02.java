package day28_construtorCall_statickeyword;

public class C02 {
	
	int x=5;
	static int y=10;

	@SuppressWarnings("static-access") //sari unlemlerden kurtulmak icin yazdik
	public static void main(String[] args) {
		// 3 tane obje olusturalim ve degisimleri gorelim
		
		C02 obje1=new C02();
		System.out.println("obje1 icin x:"+obje1.x+ ", obje1 icin y:"+obje1.y);
		
		obje1.x++;
		obje1.y++;
		
		System.out.println("islemden sonra obje1 icin x:"+obje1.x+ ", islemden sonra obje1 icin y:"+obje1.y);

		C02 obje2=new C02();
		System.out.println("obje2 icin x:"+obje2.x+ ", obje2 icin y:"+obje2.y);
		
		obje2.x++;
		obje2.y++;
		System.out.println("islemden sonra obje2 icin x:"+obje2.x+ ", islemden sonra obje2 icin y:"+obje2.y);
		
		System.out.println("Obje2 olusturulduktan sonra obje1'in x:"+obje1.x +", y:"+obje1.y);
		//static ise direk anakaynaktan kullaniyor ve degistiriyor
		// 
		
		C02 obje3=new C02();
		
		obje3.x=20;
		obje3.y=40;
		
		System.out.println("Obje3 olusturulduktan sonra obje1'in x:"+obje1.x +", y:"+obje1.y);
		System.out.println("Obje3 olusturulduktan sonra obje2'in x:"+obje2.x +", y:"+obje2.y);
		System.out.println("Obje3 olusturulduktan sonra obje3'in x:"+obje3.x +", y:"+obje3.y);
		
	}

}
