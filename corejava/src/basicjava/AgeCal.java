package basicjava;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AgeCal {
	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		LocalDate birthday=LocalDate.of(2000, Month.OCTOBER,21);
		Period p= Period.between(birthday,today);
		System.out.println(p.getYears());
	}

}
