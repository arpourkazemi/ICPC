import java.util.Scanner;

public class ArrayDecrements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        testCase:
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = input.nextLong();
            }
            int lastNonZeroIndex = -1;
            long lastNonZeroValue = -1;
            for (int j = 0; j < n; j++) {
                b[j] = input.nextLong();
                if (b[j] != 0) {
                    lastNonZeroIndex = j;
                    lastNonZeroValue = a[j] - b[j];
                }
            }
            if (lastNonZeroIndex != -1) {
                for (int j = 0; j < n; j++) {
                    if ((a[j] - b[j]) < 0 || (a[j] - b[j]) > lastNonZeroValue || ((a[j] - b[j]) < lastNonZeroValue && b[j] != 0)){
                        ans[i] = false;
                        continue testCase;
                    }
                }
            }
            ans[i] = true;
        }
        for (int i = 0; i < t; i++) {
            if (ans[i]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
