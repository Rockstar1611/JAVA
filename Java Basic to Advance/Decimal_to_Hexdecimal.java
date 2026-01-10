package Level2;

import java.util.Scanner;

public class Decimal_to_Hexdecimal {
//2545/16 like same as binary,octal
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to convert Decimal to Hexadecimal: ");
		String s=" ";
		int n=scan.nextInt();
		while(n!=0)
		{
			int r=n%16;
			if(r<=9)
			{
				s=r+s;
			}
			else if(r==10)s="A"+s;
			else if(r==11)s="B"+s;
			else if(r==12)s="C"+s;
			else if(r==13)s="D"+s;
			else if(r==14)s="E"+s;
			else {
				s="F"+s;
			}
			n=n/16;
		}
		System.out.println("HexaDecimal : "+s);
	}
}