import java.util.Arrays;
import java.util.Scanner;

public class Barrels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            Long[] nums = new Long[n];
            for (int j = 0; j < n; j++) {
                nums[j] = input.nextLong();
            }
            Arrays.sort(nums);
            Long ans = nums[n - 1];
            for (int j = 0; j < k; j++) {
                ans = ans + nums[n - 2 - j];
            }
            System.out.println(ans);
        }
    }
}
