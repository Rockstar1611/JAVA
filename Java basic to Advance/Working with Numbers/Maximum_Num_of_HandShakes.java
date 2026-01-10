package Level2;

import java.util.Scanner;

public class Maximum_Num_of_HandShakes {
/* -- N=8; handshake=((n-1)*n)/2=(8*7)/2=28 -- */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number Num :");
		int num=scan.nextInt();
		int total=num*(num-1)/2;
		System.out.println("Maximum number of Hansshakes :"+total);
	}
}
