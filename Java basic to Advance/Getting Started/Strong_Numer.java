package preplnsta;

import java.util.Scanner;

class Strong
{
	static  int Factor(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	boolean StrongNumber(int num)
	{
		int temp=num;
		int sum=0;
		int digit=0;
		while(temp!=0)
		{
			digit=temp%10;
			sum=sum+Factor(digit);
			temp=temp/10;
		}
		if(sum==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Strong_Numer {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number num: ");
		int n=scan.nextInt();
		Strong s=new Strong();
		boolean res=s.StrongNumber(n);
		if(res==true) {
			System.out.println("Enter the number: "+n+" is a Strong number.");
		}
		else {
			System.out.println("Enter the number: "+n+" is not a Strong number.");
		}
	}
}