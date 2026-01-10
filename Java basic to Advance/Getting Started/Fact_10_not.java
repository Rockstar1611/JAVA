package preplnsta;

import java.util.Scanner;

//Factors of number 10
class Fact{
	static boolean Factors(int num)
	{
		if(10%num==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
}

public class Fact_10_not {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a numner to check it is a factor of 10 or not: ");
		int num=scan.nextInt();
		boolean res=Fact.Factors(num);
		if(res==true)
		{
			System.out.println("Entered number "+num+" is the factors of 10");
		}
		else {
			System.out.println("Entered number "+num+" is not a factors of 10");
		}
	}
}
