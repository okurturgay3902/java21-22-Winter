package day33_stringBuilder;

public class C04_ {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ogrendik");	
		//araya cok iyi ekleyelim
		
		sb.insert(4, "yi cok iyi");
		System.out.println(sb);//Javayi cok iyi ogrendik
		
		//sonuna ", yasasin" ekleyelim
		
		String str2="cok iyiyim";
		
		sb.insert(7, str2, 0, 4);// baska bir str den aralik aldi
		System.out.println(sb);
		
		sb.replace(7, 10, "fena");
		System.out.println(sb); //Javayi fena cok iyi ogrendik
		
		
		
		
		
		
	}

}
