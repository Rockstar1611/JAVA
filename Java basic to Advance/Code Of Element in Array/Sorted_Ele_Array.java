package Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Sorted_Ele_Array
{
	private static final int MAX=254;
	
	public static void main(String[] args)
	{
		int[]a= {0,1,2,1,4,3,1,3,5,1,2,6,3,4,5,2,1,0};
		int n=a.length;
		int[][]arr=new int[MAX][2];
		int[][]brr=new int [MAX][2];
		int k=0,temp,count;
		for(int i=0;i<n;i++)
		{
			arr[i][0]=a[i];
			arr[i][1]=0;
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i][1]==1)
			{
				continue;
			}
			count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i][0]==arr[j][0])
				{
					arr[j][1]=1;
					count++;
				}
			}
			brr[k][0]=arr[i][0];
			brr[k][1]=count;
			k++;
		}
		n=k;
		for(int i=0;i<n-1;i++)
		{
			temp=brr[i][1];
			for(int j=i+1;j<n;j++)
			{
				if(temp<brr[j][1])
				{
					temp=brr[j][1];
					brr[j][1]=brr[i][1];
					brr[i][1]=temp;
					temp=brr[j][0];
					brr[j][0]=brr[i][0];
					brr[i][0]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			while(brr[i][1]!=0)
			{
				System.out.print(brr[i][0]+" ");
				brr[i][1]--;
			}
		}
	}

}
