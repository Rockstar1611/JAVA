package Level2;

import java.util.Scanner;

public class Permutation 
{
	
/*-- nPr=n!(n-r)!--*/
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=scan.nextInt();
		System.out.println("Enter the value of r: ");
		int r=scan.nextInt();
		int fact1 =1;
		for(int i=n;i>1;i=i-1)
		{
			fact1=fact1*i;
		}
		int number;
		number=n-r;
		int fact2=1;
		for(int i=number;i>1;i=i-1)
		{
			fact2=fact2*i;
		}
		int Pre=fact1/fact2;
		System.out.println("Permutation values of "+n+" and "+r+" is : "+Pre);
	}

}
