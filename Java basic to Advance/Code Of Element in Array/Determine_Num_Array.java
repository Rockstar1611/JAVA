package Arrays;

public class Determine_Num_Array
{
	public static boolean make_equal(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			while(arr[i]%2==0)
				arr[i] /=2;
			while(arr[i]%3==0)
				arr[i] /=3;
		}
		for(int i=1;i<n;i++)
		{
			if(arr[i]==arr[0])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[]= {50,60,89,98};
		int m=arr.length;
		if(make_equal(arr,m))
			System.out.print("determine can all numbers of an array be made equal: YES");
		else
			System.out.println("determine can all numbers not of an array be made equal: NO");
	}

}
