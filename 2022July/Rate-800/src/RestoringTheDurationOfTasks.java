import java.util.Scanner;

public class RestoringTheDurationOfTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[][] ans = new long[t][];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            long[] s = new long[n];
            long[] f = new long[n];
            ans[i] = new long[n];
            for (int j = 0; j < n; j++) {
                s[j] = input.nextLong();
            }
            for (int j = 0; j < n; j++) {
                f[j] = input.nextLong();
            }
            ans[i][0] = f[0] - s[0];
            for (int j = 1; j < n; j++) {
                ans[i][j] = f[j] - Math.max(s[j], f[j - 1]);
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
