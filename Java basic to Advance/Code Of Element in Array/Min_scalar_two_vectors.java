package Arrays;
import java.util.Arrays;
import java.util.Collections;
public class Min_scalar_two_vectors
{
    public static void main (String[] args)
    {
          Integer arr1[] = {1, 2, 6, 3, 7};
          Integer arr2[] = {10, 7, 45, 3, 7};
          int n = arr1.length;
          Arrays.sort(arr1);
          Arrays.sort(arr2, Collections.reverseOrder());

          int product = 0;
          for(int i=0; i<n; i++)
              product += arr1[i]*arr2[i];

          System.out.print("Finding the min scalar of two vectors: "+product);
   }
}