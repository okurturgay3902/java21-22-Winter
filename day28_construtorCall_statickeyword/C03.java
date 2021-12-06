package day28_construtorCall_statickeyword;

public class C03 {

	public static void main(String[] args) {
		/* Java run time bir programdir
		 * run tusuna bastigimizda java calismaya baslar ve islemleri yapar
		 * javanin isi bittiginde hersey basa doner
		 * 
		 * C03 class'indayiz C02de ki class'i burda calistirabildik
		 * Static veriable ve metodlar bulunduklari class ile ilintilidir (obje ile degil class ile)
		 * baska bir class da iken C02 deki static veriable veya method a ulasmak istedigimizde
		 * C02.statikVeriableIsmi ve C02.staticMethodIsmi() yazmak yeterlidir
		 * 
		 */
		
				C02 obje1=new C02();
				System.out.println("obje1 icin x:"+obje1.x+ ", obje1 icin y:"+C02.y);
				
				obje1.x++;
				C02.y++;
				
				System.out.println("islemden sonra obje1 icin x:"+obje1.x+ ", islemden sonra obje1 icin y:"+C02.y);

				C02 obje2=new C02();
				System.out.println("obje2 icin x:"+obje2.x+ ", obje2 icin y:"+C02.y);
				
				obje2.x++;
				C02.y++;
				System.out.println("islemden sonra obje2 icin x:"+obje2.x+ ", islemden sonra obje2 icin y:"+C02.y);
				
				System.out.println("Obje2 olusturulduktan sonra obje1'in x:"+obje1.x +", y:"+C02.y);
								
				C02 obje3=new C02();
				
				obje3.x=20;
				obje3.y=40;
			/*static bir veriable a class ismi uzerinden ulasmak yerine 
			 * instance veriable lar gibi obje ile ulasmaya calisirsak
			 * sari unlem ile bizi uyarir
			 * static bir veriable obje adi ile ulasmana gerek yok diyor	
			 */
				
				
				System.out.println("Obje3 olusturulduktan sonra obje1'in x:"+obje1.x +", y:"+C02.y);
				System.out.println("Obje3 olusturulduktan sonra obje2'in x:"+obje2.x +", y:"+C02.y);
				System.out.println("Obje3 olusturulduktan sonra obje3'in x:"+obje3.x +", y:"+C02.y);

	}

}
