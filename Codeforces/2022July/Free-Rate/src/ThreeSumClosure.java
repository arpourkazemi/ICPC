import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ThreeSumClosure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        int n;
        long[] nums;
        HashMap<Long, Boolean> hash;
        for (int i = 0; i < t; i++) {
            n = input.nextInt();
            nums = new long[n];
            hash = new HashMap<>();
            for (int j = 0; j < n; j++) {
                nums[j] = input.nextLong();
                hash.put(nums[j], true);
            }
            Arrays.sort(nums);
            ans[i] = hash.containsKey(nums[0] + nums[1] + nums[2]);
            if (ans[i] && n != 3) {
                main_for:
                for (int j = 0; j < n - 2; j++) {
                    for (int k = j + 1; k < n - 1; k++) {
                        for (int l = k + 1; l < n; l++) {
                            if (!hash.containsKey(nums[j] + nums[k] + nums[l])) {
                                ans[i] = false;
                                break main_for;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < t; i++) {
            if (ans[i]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
