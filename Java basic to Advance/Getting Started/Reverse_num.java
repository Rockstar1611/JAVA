package preplnsta;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
//Method-1
		int n=6774;
		int rev=0;
		int digit=0;
		while(n!=0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("Reverse the numnber: "+rev);
//Method-2
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int num=scan.nextInt();
		
	}
	class Demo
	{
		void Reverse(int num)
		{
			int rev1=0;
			int digit1=0;
			while(num!=0)
			{
				 digit1=num%10;
				 rev1=rev1*10+digit1;
				 num=num%10;
			}
		}
	}

}
