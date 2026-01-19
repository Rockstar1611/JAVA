package Arrays;

public class Sum_Element_Arrauy {

	public static void main(String[] args) {
		int arr[]= {43,543,2334,213,-983};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Elements in Array: "+sum);		
	}
}