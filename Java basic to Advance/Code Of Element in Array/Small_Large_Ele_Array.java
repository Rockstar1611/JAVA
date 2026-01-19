package Arrays;

public class Small_Large_Ele_Array {

	public static void main(String[] args) 
	{
		int arr[]= {12,456,775,-985,755,76644,66,455,6677544,234567,98,765,7,8,5,3,1234,-98567766};
		int largest=arr[0], smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		}
		System.out.println("Smallest Element in Array: "+smallest);
		System.out.println("Largest Element in Array: "+largest);
	}

}
