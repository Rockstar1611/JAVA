package preplnsta;

import java.util.Scanner;

public class Friendly_Pair {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int sum1= getDivisorsSum(n1);
		int sum2= getDivisorsSum(n2);
		if(sum1/n1==sum2/n2)
		{
			System.out.println(n1+" & "+n2+" are Friendly pairs");
		}
		else {
			System.out.println(n1+" & "+n2+" are not Friendly pairs");
		}	
	}
	static int getDivisorsSum(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		return sum;
	}
}
