package preplnsta;

import java.util.Scanner;

class Series{
	static void Fibonacci(int n)
	{
		int num1=0;
		int num2=1;
		if(n==0) {
			System.out.println(num1);
		}
		else if(n==1)
		{
			System.out.println(num2);
		}
		else if(n==2)
		{
			System.out.println(num1+" "+num2);
		}
		else {
			System.out.println(num1+" "+num2+" ");
			for(int i=3;i<=n;i++)
			{
				int fib=num1+num2;
				System.out.println(fib+" ");
				num1=num2;
				num2=fib;
			}
		}
	}
}

public class Fibonic_series {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=scan.nextInt();
		Series.Fibonacci(n);
	}

}
