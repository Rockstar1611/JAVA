package preplnsta;

import java.util.Scanner;

class demo
{
	static int getCount(int num)
	{
		int count=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
	static int getSum(int power,int num)
	{
		int sum=0;
		if(num==0)
		{
			return 0;
		}
		while(num!=0)
		{
			int digit=num%10;
			int value=(int)Math.pow(sum, digit);
			sum=sum+value;
			num=num/10;
		}
		return sum;
	}
}

public class Armstrong_Number 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		int power=demo.getCount(num);
		int res=demo.getSum(num,power);
		if(num==res)
		{
			System.out.println("Enter number: "+num+" is Armstrong");
		}
		else
		{
			System.out.println("Enter number: "+num+" is not a Armstrong");
		}
	}
  }