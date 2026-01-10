package preplnsta;

import java.util.Scanner;

public class Range_Sum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 2 numbers :");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int sum1=0;
		for(int i=a;i<=b;i++)
			sum1=sum1+i;
		System.out.println("Enter the sum is :"+sum1);
		
		
		System.out.println("Enter the 2 value : ");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int sum2=n2*(n2+1)/2-n1*(n1+1)/2+n1;
		System.out.println("This sum is :"+sum2);
		
		}
}
