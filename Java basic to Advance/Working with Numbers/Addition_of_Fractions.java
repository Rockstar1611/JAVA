package Level2;

import java.util.Scanner;

public class Addition_of_Fractions 
{
	
// n1/n2+n3/n4=? //
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numerator of First fraction :");
		int num1=scan.nextInt();
		System.out.println("Enter the denominator of First fraction :");
		int den1=scan.nextInt();
		System.out.println("Enter the numerator of second fraction :");
		int num2=scan.nextInt();
		System.out.println("Enter the denominator of First fraction :");
		int den2=scan.nextInt();
		System.out.println("("+num1+" / "+den1+") + ("+num2+" / "+den2+") = ");
		int numerator = (num1 * den2) + (num2 * den1);
		int denomerator = den1 * den2;

		int resultN = numerator /gcd(numerator , denomerator);
		int resultD = denomerator /gcd(numerator , denomerator);

		System.out.println(resultN +" / "+resultD);

		}

		public static int gcd(int a , int b){

		return b==0?a:gcd(b , a%b);

		}
	}