package day10_ternary_SwithCase;

public class C08_SwichCase {

	public static void main(String[] args) {
		// Gun numarasina gore hafta ici ve ya hafta sonu yazdiralim
		
		int gunNo=7;
		
		switch(gunNo) {
		
			case 1:
			case 2:			
			case 3:			
			case 4:			
			case 5:
			System.out.println("Hafta ici");
			break;
			case 6:			
			case 7:
			System.out.println("Hafta Sonu");
			break;
			default:
			System.out.println("Lutfen gecerli bir gun yaziniz");
			
			
			}

		}

	}
