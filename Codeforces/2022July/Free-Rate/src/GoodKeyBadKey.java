import java.util.Scanner;

public class GoodKeyBadKey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            long k = input.nextInt();
            long[] nums = new long[n + 1];
            for (int j = 0; j < n + 1; j++) {
                nums[j] = input.nextLong();
            }
            long[][] dp = new long[n][n];
            dp[0][0] = 0;
            for (int j = 1; j < n; j++) {
                dp[0][j] = dp[0][j - 1] + nums[j - 1] - k;
                for (int l = 1; l <= j; l++) {
                    dp[l][j] = Math.max(dp[l - 1][j - 1] + (nums[j - 1] / 2), dp[l][j - 1] + (nums[j - 1] / 2 * j));
                }
            }
            long max = Integer.MIN_VALUE;
            dp[0][n] = dp[0][n - 1] + nums[n - 1] - k;
            for (int l = 1; l <= n; l++) {
                dp[l][n] = Math.max(dp[l - 1][n - 1] + (nums[n - 1] / 2), dp[l][n - 1] + (nums[n - 1] / 2 * n));
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
