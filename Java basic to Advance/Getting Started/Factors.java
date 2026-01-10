package preplnsta;

import java.util.Scanner;

class Facts
{
	static void PrintFactor(int num)
	{
	   for(int i=1;i<=num;i++)
	   {
		   if(num%i==0)
		   {
			   System.out.println(i);
		   }
		}
	}
}
	
public class Factors {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number num: ");
	int num=scan.nextInt();
	Facts.PrintFactor(num);
	}

}
