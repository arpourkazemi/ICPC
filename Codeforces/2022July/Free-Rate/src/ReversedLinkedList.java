import java.util.Scanner;

public class ReversedLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextLong();
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) System.out.print(nums[i] + " ");
            else {
                int j = i;
                while (j < n - 1 && nums[j + 1] % 2 == 0) j++;
                for (int k = j; k >= i; k--) {
                    System.out.print(nums[k] + " ");
                }
                i = j;
            }
        }
    }
}
