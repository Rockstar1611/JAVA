package preplnsta;

import java.util.Scanner;

public class Perfact_Range {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number from range: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		Perfact_num p=new Perfact_num();
		for(int i=a;i<=b;i++)
		{
			int res=p.detectPerfect(i);
			if(res==i)
			{
				System.out.println(i+" Is Perfact number");
			}
		}
	}

}
