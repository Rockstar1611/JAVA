package Level2;

import java.util.Scanner;

public class Octal_to_Decimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Octal number : ");
		int octal=scan.nextInt();
		int decimal=0;
		int n=0;
		while(octal>0)
		{
			int temp=octal%10;
			decimal +=temp*Math.pow(8,n);
			octal=octal/10;
			n++;
		}
		System.out.println("Conversion of Octal toDecimal number is:"+decimal);
		scan.close();
	}

}
