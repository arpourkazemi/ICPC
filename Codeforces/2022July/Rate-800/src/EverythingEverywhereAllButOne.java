import java.util.Scanner;

public class EverythingEverywhereAllButOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int sum = 0;
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = input.nextInt();
                sum += nums[j];
            }
            for (int j = 0; j < n; j++) {
                if (sum == nums[j] * n) {
                    ans[i] = true;
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
