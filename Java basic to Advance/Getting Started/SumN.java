package preplnsta;

import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n=scan.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
			sum=sum+i;
        System.out.println("Enter the sumN : "+sum);
        
        int num=scan.nextInt();
        System.out.println("Enter the Sum value : "+n*(n+1)/2);
	}

}
