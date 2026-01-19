package Arrays;

public class Smallest_Ele_Array {

	public static void main(String[] args) 
	{
		int arr[]= {12,4556,65,9,-65,0,6,123};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest Element in Array: "+min);
	}

}
