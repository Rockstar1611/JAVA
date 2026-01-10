package Level2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int hcf=0;
		for(int i=1;i<=num1 || i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
		}
		int lcm = (num1* num2)/hcf;
		System.out.println("The LCM of a number : "+lcm);
	}

}
