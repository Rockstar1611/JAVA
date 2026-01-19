package Arrays;

public class EquilibriumIndexOfArray
{
	static int equilibrium_index(int arr[],int n)
	{
		int sum=0;
		int leftsum=0;
		for(int i=0;i<n;i++) {
			sum +=arr[i];
		}
		for(int i=0;i<n;++i) {
			sum -=arr[i];
			if(leftsum==sum)
				return i;
			leftsum +=arr[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,5,7,22,12,53,8};
		int arr_size=arr.length;
		System.out.print("Equilibrium Index: ");
		System.out.println(equilibrium_index(arr,arr_size));
	}

}
