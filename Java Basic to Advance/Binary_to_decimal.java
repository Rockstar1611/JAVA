package Level2;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Binary Number: ");
		int binary=scan.nextInt();
		int decimal=0;
		int n=0;
		while(binary >0)
		{
			int temp=binary%10;
			decimal +=temp*Math.pow(2,n);
			binary=binary/10;
			n++;
		}
		System.out.println("Decimal number : "+decimal);
		scan.close();
	}

}
