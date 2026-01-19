package Arrays;

public class Second_Smallest_ele_Array
{
	static int secSmallest(int arr[],int n)
	{
		int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<first)
			{
				second=first;
				first=arr[i];
			}
			else if(second>arr[i])
			{
				second=arr[i];
			}
		}
		return second;
	}
	public static void main(String[] args)
	{
		int arr[]= {21,34,5,6454,54,34,32,51};
		int n=arr.length;
		System.out.println("Second Smallest Element: "+secSmallest(arr,n));
	}

}
