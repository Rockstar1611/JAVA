package preplnsta;

import java.util.Scanner;

class MainPol{
	int Palindrome(int num)
	{
		int rev=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
	}
}

public class Polindrome {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number n:");
		int num=scan.nextInt();
		MainPol m=new MainPol();
		int res=m.Palindrome(num);
		if(num==res)
		{
			System.out.println(res+" is a Palindrome");
		}
		else {
			System.out.println(res+" is not a Palindrome");
		}
	}

}
