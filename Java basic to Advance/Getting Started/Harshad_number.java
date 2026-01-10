package preplnsta;

import java.util.Scanner;

class Harshad
{
	static boolean detectHarshad(int num)
	{
		int orginal=num;
		int sum=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num%10;
		}
		if(orginal%sum==0)
		{
			 return true;
		}
		else {
			 return false;
		}
	}
}
public class Harshad_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the  number: ");
		int num=scan.nextInt();
		boolean res=Harshad.detectHarshad(num);
		if(res==true) {
			System.out.println("Entered number "+num+" is Harshad");
		}
		else {
			System.out.println("Entered number "+num+" is not Harshad");
		}
	}
}