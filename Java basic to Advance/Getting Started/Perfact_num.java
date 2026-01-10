package preplnsta;

import java.util.Scanner;

public class Perfact_num 
{
	static int detectPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=scan.nextInt();
		int res=Perfact_num.detectPerfect(num);
		if(res==num)
		{
			System.out.println("Entered number "+num+" is a Perfact number.");
		}
		else
		{
			System.out.println("Entered number "+num+" is not a Perfect number.");
		}
	}
}