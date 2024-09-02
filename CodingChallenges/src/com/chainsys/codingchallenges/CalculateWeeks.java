package com.chainsys.codingchallenges;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculateWeeks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start date:(yy-mm-dd)");
		String startDate = sc.next();
		System.out.println("Enter a end date:(yy-mm-dd)");
		String endDate = sc.next();
		LocalDate date = LocalDate.parse(startDate);
		LocalDate date1 = LocalDate.parse(endDate);
		long weeks = ChronoUnit.WEEKS.between(date, date1);
		System.out.println(weeks);
	}

}
