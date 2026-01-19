package Arrays;
import java.util.Arrays;
public class Max_Product_SubArrays
{
	static int maxSubarrayProduct(int arr[])
	{
		int result=arr[0];
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int mul=arr[i];
			for(int j=i+1;j<n;j++)
			{
				result=Math.max(result,mul);
				mul *=arr[j];
			}
			result=Math.max(result, mul);
		}
		 return result;
	}
	public static void main(String[] args) {
		int arr[]= {10,-20,-30,50,0,50,-80,40,-20};
		System.out.println("Maximum Sub array Product is: "+maxSubarrayProduct(arr));
	}

}
