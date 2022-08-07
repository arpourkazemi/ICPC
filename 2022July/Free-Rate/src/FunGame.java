import java.util.Scanner;

public class FunGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int A = 0, B = n - 1;
        while (A != n && B != -1) {
            if (nums[A] > nums[B]) {
                System.out.print("1 ");
                B--;
            } else if (nums[A] < nums[B]) {
                System.out.print("2 ");
                A++;
            } else {
                System.out.print("0 ");
                B--;
                A++;
            }
        }
    }
}
