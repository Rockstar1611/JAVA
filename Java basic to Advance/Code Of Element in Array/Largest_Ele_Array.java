package Arrays;

public class Largest_Ele_Array {

	public static void main(String[] args) {
		int arr[]= {12,32,42,56,52,421,32,4563};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Larrgest Element in Array : "+max);
	}

}
