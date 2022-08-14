import java.util.Scanner;

public class NewYearTransportation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int current;
        for (int i = 1; i < n; i++) {
            current = i + nums[i - 1];

        }
    }
}
