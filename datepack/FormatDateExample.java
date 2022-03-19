package datepack;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter dformat=DateTimeFormatter.ofPattern("yyyy MM dd");
		
		LocalDate locldate=LocalDate.of(2012,Month.NOVEMBER,1);
			System.out.println(locldate.format(dformat));
			LocalDate otherlocaldate= LocalDate.of(2011,Month.APRIL,1);
	System.out.println(otherlocaldate.format(dformat));
	}

}
