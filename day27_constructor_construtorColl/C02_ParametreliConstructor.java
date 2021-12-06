package day27_constructor_construtorColl;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		/* Javanin olusturdugu defult Constructor ile obje olusturabiliyoruz
		 * ama her obje icin yeniden deger atamasi yapmak uzun oluyor
		 * istersek parametreleri Constructor lar olusturup 
		 * daha obje olustururken istedigim ozellikleri atayabiliriz
		 */
		
		Car1 car1 =new Car1(50000, "Vectra", "Beyaz", 2005, true);
							//int km, String model, String renk, int yil, boolean satilikMi
		
			
		Car1 car2 =new Car1(45000);
		
		System.out.println(car2.km); //45000
		
		
		Car1 car3=new Car1();
        System.out.println(car3.km); // 0
        
        Car1 car4=new Car1(1000);
        System.out.println(car4.km); // 1000
        
        // yil ve km yi parametre olarak girebilecegim bir constructor daha olusturabilir miyim ?
        
        Car1 car5=new Car1(2020, 5000);
                         // yil   km
        System.out.println(car5.yil + " " + car5.km + " " + car5.model);
        //                   2020             5000            null 
		
		
		

	}

}
