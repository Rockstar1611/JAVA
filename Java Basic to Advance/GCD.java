package Level2;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int min=num1<num2?num1:num2,i;
		for(i=min;i>=1;i--)
			if((num1%i==0)&&(num2%i==0))
				break;
		System.out.println("Greatest Common Divisor of "+num1+" & "+num2+" is: "+i);
	}

}
