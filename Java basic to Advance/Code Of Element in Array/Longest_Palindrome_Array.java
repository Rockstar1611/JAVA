package Arrays;

public class Longest_Palindrome_Array
{
	static boolean isPalindrome(int n)
	{
		int div=1;
		while(n/div>=10)
		{
			div *=10;
		}
		while(n!=0) {
			int x=n/div;
			int y=n%10;
			if(x!=y)
				return false;
			n=(n%div)/10;
			div=div/100;
		}
		return true;
	}
	static int largestPalindrome(int[]A,int n)
	{
		int res=-1;
		for(int i=0;i<n;i++)
		{
			if(A[i]>res && isPalindrome(A[i]))
				res=A[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int[]A= {121,2321,445444544,545454545,900909009};
		int n=A.length;
		System.out.println(largestPalindrome(A,n));
	}

}
