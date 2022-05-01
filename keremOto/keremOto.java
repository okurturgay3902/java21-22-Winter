package keremOto;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class keremOto {
    public static void main(String[] args) {
        /*
        * Oto yedek parca isi yapan Kerem Bey, toptancilardan aldigi yedek parcalari, kendi envanterine kendi sistemi ile kaydedip,
        *  bu parcalari depoya yerlestirirken bir takim süreclerden gecirmek istemektir.
        *  Bu süreclerin her biri bir fonksiyon olarak tanimlanacaktir.
Araba parcalari ise bir array icinde verilecektir.
örnek array: ["Kaporta5", "Ak3ü",  "Stop Lambasi", "Radyatör 21", "Karbüratör 42", "Tekerlek", "3 AYNA", "Jant"]
Kerem Bey'in istedigi program, asagiaki durumlari karsilamasi gerekmektedir.
1. Parca isimleri büyük harflere cevrilecektir.
2. Parca isimlerinden sayilar cikartilacaktir.
3. Parca isimleri tersine cevrilecektir.
4. Her parcanin basina KEREMAG_ eklenecektir.
5. Her parcanin sonuna ise parcanin sisteme girildigi tarih eklenecektir.
*  (Date nesnesini kullanarak tarih ve saat konulmasi yeterlidir)
*   */
String envanter[]={"Kaporta5", "Ak3u",  "Stop Lambasi", "Radyator 21", "Karburator 42", "Tekerlek",
        "3 AYNA", "Jant" , "51CONta ", "kayiS5 ", "Zincir7 ", "kap5ak ", "silind55ir ", "somun ", "MAcun " };

doLoverCase(envanter);
System.out.println(Arrays.asList(envanter));

deleteNumber(envanter);
System.out.println(Arrays.asList(envanter));

ters(envanter);
System.out.println(Arrays.asList(envanter));

add_Kremag(envanter);
System.out.println(Arrays.asList(envanter));

addDate(envanter);
System.out.println(Arrays.asList(envanter));

//System.out.println(Arrays.asList(addDate(add_Kremag(ters(deleteNumber(doLoverCase(envanter))))))) ;
 
    } //Tarih ekleme methodu
    public static String[] addDate(String[] envanter) {
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate= DateFor.format(date);
        for (int i = 0; i<envanter.length ; i++) {
            envanter[i]=envanter[i]+"_"+stringDate;
        }
        return  envanter ;
    }
    
  //KEREMAG_ ekleme methodu
    public static String[] add_Kremag(String[] envanter) {
        for (int i = 0; i<envanter.length ; i++) {
            envanter[i]="KEREMAG_"+ envanter[i];
        }
        return  envanter ;
    }
    
  //Ters yazma methodu
    public static String[] ters(String[] envanter) {
        for (int i = 0; i<envanter.length ; i++) {
           StringBuilder tersStr=new StringBuilder(envanter[i]);
            envanter[i]= new String(tersStr.reverse());
        }
return  envanter ;
    }
    
  //Buyuk harf yazma methodu
    public static String[] doLoverCase(String[] envanter) {
        for (int i = 0; i<envanter.length ; i++) {
            envanter[i]=envanter[i].toUpperCase();
        }
        return  envanter ;
    };
    
    
    
  //Sayi silme methodu
    public static String[] deleteNumber(String[] envanter) {
        for (int i = 0; i <envanter.length; i++) {
            String word="" ;
            for (int j = 0; j < envanter[i].length(); j++) {
                if(!(envanter[i].charAt(j)>=48&&envanter[i].charAt(j)<=57)){
              word= word+envanter[i].charAt(j);
                }
            };
            envanter[i]=word;
        };
        return  envanter ;
    };
} //class sonu