package Level2;

import java.util.Scanner;

public class Decimal_to_Octa {
//214/8=26 rem 6,26/8=3 rem=2,3/8=0 rem 3 ,(214)10=(326)8
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to convert Decimal to Octa: ");
		int decimal=scan.nextInt();
		int octal[]=new int[20];
		int i=0;
		while(decimal>0)
		{
			int r=decimal%8;
			octal[i++]=r;
			decimal=decimal/8;
		}
		System.out.print("Octal number : ");
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(octal[j]+"");
		}
	}

}
