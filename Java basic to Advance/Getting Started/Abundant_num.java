package preplnsta;

import java.util.Scanner;

class Abundant{
	static int FindAbun(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class Abundant_num {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();
		Abundant ab=new Abundant();
		int res=ab.FindAbun(n);
		if(res==n)
		{
			System.out.println(n+" Is a Abundant number");
		}
		else
		{
			System.out.println(n+" Is a Abundant number");
		}
	}
}
