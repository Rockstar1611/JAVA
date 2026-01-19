package Arrays;
import java.util.Arrays;
public class Repeating_Ele_Array 
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
				if(arr[i]==arr[j])
				{
					visited[j]=true;
					count++;
				}
			}
			if(count!=1)
				System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int arr[]=new int[] {10,20,40,30,10,20,30,20,20,30,50,40,30};
		int n=arr.length;
		countFreq(arr,n);
	}

}
