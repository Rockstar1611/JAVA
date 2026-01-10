
package preplnsta;

import java.util.Scanner;

public class Prime_num_Range {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		Prime_num1 p=new Prime_num1();
		for(int i=a;i<=b;i++)
		{
		   boolean res=p.CheckPrime(i);
		   if(res==true)
		   {
			   System.out.println(i);
		   }
		}
	}
	
}