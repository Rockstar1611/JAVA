package Level2;

import java.util.Scanner;

public class Replace_0s_to_1s 
{

	// ex=7012304145  re=7102314045//
	
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter the number :");
		 int num=scan.nextInt();
		 String str=Integer.toString(num);
		 int len=str.length();
		 String str1=" ";
		 for(int i=0;i<len;i++)
		 {
			 if(str.charAt(i)=='0')
				 str1=str1+'1';
			 else
				 str1=str1+str.charAt(i);
		 }
		 System.out.println("Convert number is: "+str1);
		 scan.close();
	}

}
