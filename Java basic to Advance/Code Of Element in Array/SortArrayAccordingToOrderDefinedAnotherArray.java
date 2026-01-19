package Arrays;
import java.util.Arrays;
import java.util.HashMap;

public class SortArrayAccordingToOrderDefinedAnotherArray
{
	static void sortAccording(int[] A1,int[] A2,int m,int n)
	{
		HashMap<Integer, Integer> index=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(!index.containsKey(A2[i]))
				index.put(A2[i],i+1);
		}
		int[] tmp= Arrays.stream(A1).boxed().sorted((p1, p2) -> {
            int idx1 = index.getOrDefault(p1, 0);
            int idx2 = index.getOrDefault(p2, 0);

            if (idx1 == 0 && idx2 == 0)
                return p1 - p2;

            if (idx1 == 0)
                return 1;

            if (idx2 == 0)
                return -1;

            return idx1 - idx2;
        }).mapToInt(i -> i).toArray();
		
		for(int i=0;i<m;i++)
		{
			A1[i]=tmp[i];
		}
	}
	public static void main(String[] args) {
		int arr1[]= {20,30,4,2,1,98,5,7,9,0,3,2,18,54};
		int arr2[]= {20,1,18,28,39};
		int m=arr1.length;
		int n=arr2.length;
		sortAccording(arr1,arr2,m,n);
		System.out.println(Arrays.toString(arr1));
	}

}
