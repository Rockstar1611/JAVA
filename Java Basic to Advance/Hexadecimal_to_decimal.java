package Level2;

import java.util.Scanner;

public class Hexadecimal_to_decimal {
// A,B,C,D=11,12,13,14 like this
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Hexadecimal number: ");
		String hex=scan.nextLine();
		int decimal=Integer.parseInt(hex,16);
		System.out.println("Decimal version is: "+decimal);
	}
}