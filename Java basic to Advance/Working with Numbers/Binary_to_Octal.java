package Level2;

import java.util.Scanner;

public class Binary_to_Octal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Binary number: ");
		int num=scan.nextInt();
		String octal=Integer.toOctalString(num);
		System.out.println("Octal version is : "+octal);
	}

}
