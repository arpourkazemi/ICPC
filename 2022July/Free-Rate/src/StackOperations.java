import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextLong();
        }
        if (n == 1) {
            if (k % 2 == 0) System.out.println(nums[0]);
            else System.out.println(-1);
            return;
        }
        if (k == 1) {
            System.out.println(nums[1]);
            return;
        }
        long max = Long.MIN_VALUE;
        if (k < n) {
            for (int i = 0; i <= k; i++) {
                if (i != (k - 1) && nums[i] > max) max = nums[i];
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (nums[i] > max) max = nums[i];
            }
        }
        System.out.println(max);
    }
}
