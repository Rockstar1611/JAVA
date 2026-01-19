package Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frquency_Elements_Array
{
	static void countFreq(int arr[],int n)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer,Integer>entry: map.entrySet())
		{
			System.out.println(entry.getKey()+": occurs"+entry.getValue()+"times");
		}
	}
	public static void main(String[] args)
	{
		int arr[]=new int[] {10,20,30,40,50,60,50,50,60,20,432,65,34,10};
		int n=arr.length;
		countFreq(arr,n);
	}
}
