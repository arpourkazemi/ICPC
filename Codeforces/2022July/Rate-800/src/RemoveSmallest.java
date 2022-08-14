import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        for (int i = 0; i < t; i++) {
            ans[i] = true;
            int n = input.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = input.nextInt();
            }
            Arrays.sort(nums);
            for (int j = 1; j < n; j++) {
                if (nums[j] - nums[j - 1] > 1) {
                    ans[i] = false;
                    break;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            if (ans[i]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
