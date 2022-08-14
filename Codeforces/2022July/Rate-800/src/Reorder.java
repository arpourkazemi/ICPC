import java.util.Scanner;

public class Reorder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += input.nextInt();
            }
            if (sum == m) ans[i] = true;
        }
        for (int i = 0; i < t; i++) {
            if (ans[i]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
