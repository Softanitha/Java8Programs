package DateTime;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalDate yesterday=date.minusDays(1);
        LocalDate tomorrow=yesterday.plusDays(2);
        System.out.println("Today date is: "+date);
        System.out.println("Yesterday date is: "+yesterday);
        System.out.println("Tomorrow date id: "+tomorrow);
        
        LocalDate date1=LocalDate.of(2024, 7, 5);
        System.out.println("2024 year is leap year :"+date1.isLeapYear());
        LocalDate date2=LocalDate.of(1993, 7, 5);
        System.out.println("1993 year is leap year :"+date2.isLeapYear());
	
	}

}
