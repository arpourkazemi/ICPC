import java.util.Scanner;

public class OddSubArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = input.nextInt();
            }
            for (int j = 1; j < n; j++) {
                if (nums[j] < nums[j - 1]){
                    ans[i]++;
                    j++;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
