package day17_forLoop;

import java.util.Scanner;

public class C09_calisma {

	public static void main1(String[] args) {
		//ali veliyle ata bak
		//bak ata veliyle ali
		
	}
		public static void main(String[] args) {
	        Scanner scan =new Scanner(System.in);
	        System.out.println("Lutfen kelime veya cumle giriniz:");
	        String kelime=scan.nextLine();
	        
	        
	        int kelimeSayac=1;
	        
	        String ters = "";
	        
	        for (int i = 0; i <=kelime.length()-1; i++) {
	            
	            if (kelime.charAt(i)==' ') {
	                kelimeSayac++;
	            }
	            
	        }
	        
	                        
	        for (int i = 1; i <=kelimeSayac; i++) {   
	            
	            if (kelime.contains(" ")) {
	                
	                int sonBosluk = kelime.lastIndexOf(" ");
	                ters+=kelime.substring(sonBosluk+1)+" ";
	                kelime=kelime.substring(0,sonBosluk);
	            }else {
	                ters+=kelime.substring(0);
	            }
	            
	        }
	        
	        System.out.println(ters);

	        scan.close();
	}

}
