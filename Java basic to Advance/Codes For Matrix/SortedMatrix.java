package CodesForRelativeMatrics;
import java.util.Arrays;

public class SortedMatrix {

	public static void main(String[] args) {
		int mat[][]= {{10,20,30,40},
				{50,60,70,80},
				{15,25,35,45},
				{55,65,75,85}};
		int n=4,m=4;
		int[] arr=new int[n*m];
		int x=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[x++]=mat[i][j];
			}
		}
		int size=n*m;
		Arrays.sort(arr);
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
