package Arrays;

public class Arrays_Disjoint_not 
{
	static boolean Disjoint(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		int arr1[]= {10,20,42,51,4,64};
		int arr2[]= {21,80,43,2,543,7};
		if(Disjoint(arr1,arr2))
			System.out.println("Disjoint print value is : Yes");
		else 
			System.out.println("Disjoint print value is : No");
	}

}
