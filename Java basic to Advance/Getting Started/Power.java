package preplnsta;

import java.util.Scanner;

//User Define Function
class Mathamatics{
	static int Power(int base,int exp)
	{
		int power=1;
		for(int i=1;i<=base;i++)
		{
			power=power*exp;
		}
		return power;
	}
}
public class Power {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Base & Exponent: ");
//Inbuit Function
		int base=scan.nextInt();
		int exp=scan.nextInt();
		int res=(int)Math.pow(exp, base);
		System.out.println("Result "+base+" Raised to the power "+exp+" by using inbuilt function: "+res);
		int res1=Mathamatics.Power(base, exp);
		System.out.println("Result "+base+" Raised to the power "+exp+" by using user-Defined function: "+res1);
		
	}

}
