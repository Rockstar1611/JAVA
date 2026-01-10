package Level2;

import java.util.Scanner;

public class Possible_decoding 
{
	public static int countDecodings(String digits) {
        int n = digits.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (digits.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }
            if (digits.charAt(i - 2) == '1' || (digits.charAt(i - 2) == '2' && digits.charAt(i - 1) <= '6')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
	public static void main(String[] args)
	{
		String digits="12121";
		int decoding=countDecodings(digits);
		System.out.println("Number of possible decodings: "+decoding);
	}

}
