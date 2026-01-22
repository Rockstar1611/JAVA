package CodesForRelativeMatrics;

public class SpecificPairMatrix
{
	static int findMaxValue(int N,int mat[][])
	{
		int maxValue=Integer.MIN_VALUE;
		for(int a=0;a<N-1;a++) {
			for(int b=0;b<N-1;b++) {
				for(int d=a+1;d<N;d++) {
					for(int e=b+1;e<N;e++) {
						if(maxValue<(mat[d][e]-mat[a][b]))
							maxValue=mat[d][e]-mat[a][b];
					}
				}
			}
		}
		return maxValue;
	}
	public static void main(String[] args) {
		int N = 5;
		 
        int mat[][] = {
                      { 10, 12, -17, -84, -20 },
                      { -8, -3, 94, 26, 16 },
                      { 30, 8, 61, 16, 34 },
                      { -4, -1, 13, 7, -6 },
                      { 60, -4, 10, -15, 31 }
                   };
 
        System.out.print("Maximum Value is " + findMaxValue(N,mat));
	}

}
