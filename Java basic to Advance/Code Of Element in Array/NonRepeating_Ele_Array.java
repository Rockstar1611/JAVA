package Arrays;
import java.util.Arrays;
public class NonRepeating_Ele_Array 
{
	public static void countFreq(int arr[],int n)
	{
		boolean visited[]=new boolean[n];
		Arrays.fill(visited,false);
		for(int i=0;i<n;i++)
		{
			if(visited[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
			if(count==1)
				System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		int arr[]=new int[] {10,30,20,40,50,30,20,60,70,70,80,90};
		int n=arr.length;
		countFreq(arr,n);
	}

}
