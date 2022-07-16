import java.util.Scanner;

public class RisingSand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = input.nextInt();
            }
            if (k == 1){
                if (n % 2 == 0) n--;
                ans[i] = n/2;
            } else {
                int answer = 0;
                for (int j = 1; j < n - 1; j++) {
                    if (a[j] > a[j + 1] + a[j - 1]) answer++;
                }
                ans[i] = answer;
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
