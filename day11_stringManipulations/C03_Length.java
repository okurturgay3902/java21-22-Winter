package day11_stringManipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		
		String str1="Ali Kahyaoglu";
		
		System.out.println(str1.length()); //13
		
		// verilen str1 in son harfini yazdirin
		
		System.out.println(str1.charAt(str1.length()-1)); //u  index 0123 seklinde oldugundan -1
		
		String str2="";
		System.out.println(str1.charAt(str1.length()));
		
		String str3=null;
		//System.out.println(str1.charAt(str1.length())); // java.lang.NullPointerException
		
		String str4;
		
		System.out.println(str3); //null --degeri bizim bu veriable bilerek olusturgumuzu
									//bilerek deger atamadigimizi belirtiyor
		// System.out.println(str4);//eger String olusturur ama deger atamazsak yazdirdimizda hata verir
		// null pointer olusturdugumuz fakat sonra kullanacagimiz bir Stringi isaretlemek icin kullanilir
		//bir String i yazdirdigimizda null cikiyorsa turkce olara: 
		// "Ben bu degiskeni olusturdum ama henuz deger atamadim" demek istiyor
		
		
		str4= str2+str3;  // sari ! gitsin diye yazdim
		System.out.println(str4);
		
		
		

	}

}
