package datepack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateCreateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime ldt=LocalDateTime.now();
System.out.println(ldt);
LocalDate dl=LocalDate.of(1999, 2, 13);
System.out.println(dl.getDayOfMonth());
System.out.println(dl.getDayOfYear());
System.out.println(dl.getYear());

LocalTime lt1=LocalTime.of(23, 25);
System.out.println(lt1.getHour());
System.out.println(lt1.getMinute());

LocalTime lt2=LocalTime.parse("12:23:56");
System.out.println(lt2);
System.out.println(lt2.getHour());
System.out.println(lt2.getMinute());
System.out.println(lt2.getSecond());

LocalDate ld1=ldt.toLocalDate();
int day= ldt.getDayOfMonth();
Month m=ldt.getMonth();
int min= ldt.getMinute();

System.out.println("local date is"+ld1);
System.out.println("day is:"+ day);
System.out.println("month is "+ m);
System.out.println("Minutes are" +min);
//updating the local date with new day and year
LocalDateTime newDate = ldt.withDayOfMonth(15).withYear(2013);
LocalDateTime newYears=newDate.plusDays(12).plusYears(3);
System.out.println(ldt);
System.out.println("updated local date is" + newDate);

LocalDateTime newdatetime =ldt.with(TemporalAdjusters.firstDayOfNextMonth());
System.out.println(newdatetime);

	}

}
