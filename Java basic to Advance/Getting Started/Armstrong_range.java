package preplnsta;

import java.util.Scanner;

class demo1
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
			int value=(int)Math.pow(digit, power);
			sum=sum+value;
			num=num/10;
		}
		return sum;
	}
}


public class Armstrong_range {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range from numbers : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int count=0;
		for(int i=a;i<=b;i++)
		{
			int power=demo1.getCount(i);
			int res=demo1.getSum(i, power);
			if(i==res)
			{
				System.out.println(i+" :is Armstrong number");
				count ++;
			}
		}
		System.out.println("There are "+count+" Armstrong number in the given range "+a+" and "+b);
	}

}
