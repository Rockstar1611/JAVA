package preplnsta;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=scan.nextInt();
		if(year% 4==0)
			System.out.println(year+" Is a Leap year");
		else
			System.out.println(year+" Is a Non-Leap year");

	}

}
