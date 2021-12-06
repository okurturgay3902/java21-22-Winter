package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class C01_LocalDate {

	public static void main(String[] args) {
		LocalDate tarih= LocalDate.now();
		System.out.println(tarih); //2021-12-02
		
		System.out.println(tarih.getDayOfYear()); //336 yilin 336. gunu
		
		System.out.println(tarih.getDayOfMonth()); //2 ayin 2. gunu
		
		System.out.println(tarih.getDayOfWeek()); //THURSDAY
		
		System.out.println(tarih.getMonthValue()); //12
		
		System.out.println(tarih.getMonth()); //DECEMBER
		
		System.out.println(tarih.plusDays(20)); //2021-12-22   20 gun sonra
		
		System.out.println(tarih.plusMonths(5)); //5 ay sonra
		
		System.out.println(tarih.plusWeeks(15)); // 15 ay sonra...
		
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10)); 
		// 10 yil 10 ay 10 gun sonra
		
		System.out.println(tarih.minusDays(20)); //20gun once 2021-11-12
		
		System.out.println(tarih.minusYears(21).isLeapYear()); //true
		
		LocalDate dogumTarihi= LocalDate.of(1998, Month.FEBRUARY, 15);
		LocalDate dogumTarihi2= LocalDate.of(2004, 04, 15);
		LocalDate dogumTarihi1= LocalDate.ofYearDay(2016, 136); //2016-05-15
		
		System.out.println(dogumTarihi+", "+ dogumTarihi2); //1998-02-15, 2004-04-15
		
		System.out.println(dogumTarihi.isAfter(dogumTarihi2)); //false
		
		System.out.println(dogumTarihi1);// 2016-05-15
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Yil ay gun olarak sirasiyla tarihi giriniz");
		LocalDate dogumTarihi3=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println(dogumTarihi3);
		
		
		
		
		

	}

}
