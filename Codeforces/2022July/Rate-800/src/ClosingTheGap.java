import java.util.Scanner;

public class ClosingTheGap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += input.nextInt();
            }
            ans[i] = (sum%n == 0);
        }
        for (int i = 0; i < t; i++) {
            if (ans[i]) System.out.println(0);
            else System.out.println(1);
        }
    }
}
