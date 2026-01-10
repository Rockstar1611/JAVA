package Level2;

import java.util.Scanner;

public class Decimal_to_Binary {
//12/2=6 rem 0,6/2==3 rem 0,3/2==1 rem1, 1/2=0 rem=1  (12)10=(1100)2
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to convert Decimal to Binary: ");
		int decimal=scan.nextInt();
		int binary[]=new int[20];
		int i=0;
		while(decimal>0)
		{
			int r=decimal%2;
			binary[i++]=r;
			decimal=decimal/2;
		}
		System.out.print("Binary number : ");
		for(int j=i-1;j>=0;j--) {
			System.out.print(binary[j]+"");
		}
	}

}
