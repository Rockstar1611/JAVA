package Arrays;
import java.util.Arrays;
public class Min_absolute_difference_array
{
	static int sumOfMinAbsDifferences(int arr[],int n)
	{
		int result=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++)
			{
				sum +=Math.abs(arr[i]-arr[j]);
			}
			result=Math.min(sum, result);
		}
		return result;
	}
	public static void main(String[] args)
	{
		int arr[]= {2,5,3,8,4,9};
		int n=arr.length;
		System.out.println("Required Minimum Sum is: "+sumOfMinAbsDifferences(arr,n));
	}

}
