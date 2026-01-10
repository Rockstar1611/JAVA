package preplnsta;

import java.util.Scanner;

public class Strong_Range {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number from range : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		Strong s=new Strong();
		for(int i=a;i<=b;i++)
		{
			boolean res=s.StrongNumber(i);
			if(res==true)
			{
				System.out.println(i+" Is Strong number.");
			}
		}
	}

}
