package Arrays;
import java.util.*;
public class Remove_Duplicates_Array 
{

	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,10,40,50,80,90,70,30};
		int n=arr.length;
		Set hash_set=new HashSet();
		for(int i=0;i<n;i++)
			hash_set.add(arr[i]);
		System.out.print("Removing Duplicates from Array result: "+hash_set);
	}

}
