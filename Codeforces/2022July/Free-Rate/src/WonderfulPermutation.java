import java.util.Scanner;

public class WonderfulPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] nums = new int[n];
            boolean[] in = new boolean[k];
            for (int j = 0; j < n; j++) {
                nums[j] = input.nextInt();
                if (j < k && nums[j] <= k) in[nums[j] - 1] = true;
            }
            int answer = 0;
            for (int j = 0; j < k; j++) {
                if (in[j]) answer++;
            }
            ans[i] = k - answer;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
