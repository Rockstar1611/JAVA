package Arrays;
import java.util.Arrays;

public class ReplacementElementsArray
{
	static void changeArr(int[] input)
	{
		int newArray[]=Arrays.copyOfRange(input,0,input.length);
		Arrays.sort(newArray);
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input.length;j++)
			{
				if(newArray[j]==input[i])
				{
					input[i]=j+1;
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {100,2,70,32,49};
		changeArr(arr);
		System.out.println(Arrays.toString(arr));
	}
}
