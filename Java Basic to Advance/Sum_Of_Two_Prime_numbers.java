package Level2;

import java.util.Scanner;
public class Sum_Of_Two_Prime_numbers {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the  number: ");
		int num=scan.nextInt();
		int x=0;
		
		for(int i=2;i<=num/2;i++)
		{
			if(Prime_or_not(i)==1)
			{
				if(Prime_or_not(num-i)==1)
				{
					System.out.println(num+" = "+i+" + "+(num-i));
					x=1;
				}
			}
		}
		if(x==0)
			System.out.println(+num+"cannot be expaired as a sum of prime numbers");
	}
	
	public static int Prime_or_not(int n) {
		int c=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c=0;
				break;
			}
		}
		return c;
	}

}
