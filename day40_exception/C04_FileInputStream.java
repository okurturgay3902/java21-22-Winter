package day40_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// java'da bir dosyaya ulasmak istedigimizde FileInputStream class'indan yardim aliriz
		
		FileInputStream fis=new FileInputStream("src\\day40_exception\\yazi");  //burada alt cizgi var di
		
		/* java bu codda olasi bir problem ongoruyor ve 
		 * bu probleme karsi ne yapmasi gerektigini bize soruyor
		 * yani alti cizilen her kodd CTE degildir
		 * 
		 * Bunun icin 2 durum var
		 * 1- try-catch kullanarak bu problemi HANDLE edip java'nin yoluna 
		 * 	  devam etmesini saglayabiliriz
		 * 2- Eger dosya okunamiyorsa codd calismasin istiyorsak olayin farkinda oldugumuzu
		 *    ve sorumlulugun bizde oldugunu soylemeliyiz
		 */
		
		System.out.println("Gorev tamamlandi");

	}

}
