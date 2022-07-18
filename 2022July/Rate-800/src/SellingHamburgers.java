import java.util.Arrays;
import java.util.Scanner;

public class SellingHamburgers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            long[] nums = new long[n];
            long max = Long.MIN_VALUE;
            for (int j = 0; j < n; j++) nums[j] = input.nextLong();
            Arrays.sort(nums);
            for (int j = 0; j < n; j++) {
                long tmp = nums[j] * (n - j);
                if (tmp > max) max = tmp;
            }
            ans[i] = max;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
