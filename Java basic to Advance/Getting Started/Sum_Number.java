package preplnsta;

import java.util.Scanner;

public class Sum_Number {

	public static void main(String[] args)
	{
//Method-1
	int n=231133; int sum1=0;
	while(n!=0)
	{
	   sum1=sum1+n%10;
	   n=n/10;
	}
	System.out.println("Sum of Digits: "+sum1);
//Method-2
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=scan.nextInt();
	Sum s=new Sum();
	int res=s.FindSum(num);
	System.out.println("Sum of the numbers "+num+" is: "+res);
}

}
class Sum
{
int FindSum(int num)
{
	int sum=0;
	int digit=0;
	while(num!=0)
	{
		digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	return sum;
	}

}