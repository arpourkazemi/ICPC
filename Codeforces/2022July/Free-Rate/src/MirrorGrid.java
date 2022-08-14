import java.util.Scanner;

public class MirrorGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            String[] strings = new String[n];
            for (int j = 0; j < n; j++) {
                strings[j] = input.next();
            }
            int mid = (n/2);
            for (int j = 0; j < mid; j++) {
                for (int k = 0; k < mid; k++) {
                    int ones = 0;
                    int zeros = 0;
                    if (strings[j].charAt(k) == '1') ones++;
                    else zeros++;
                    if (strings[k].charAt(n - 1 - j) == '1') ones++;
                    else zeros++;
                    if (strings[n - 1 - k].charAt(j) == '1') ones++;
                    else zeros++;
                    if (strings[n - 1 - j].charAt(n - 1 - k) == '1') ones++;
                    else zeros++;
                    ans[i] += Math.min(zeros, ones);
                }
            }
            if (n % 2 == 1) {
                for (int j = 0; j < mid; j++) {
                    int ones = 0;
                    int zeros = 0;
                    if (strings[mid].charAt(j) == '1') ones++;
                    else zeros++;
                    if (strings[mid].charAt(n - 1 - j) == '1') ones++;
                    else zeros++;
                    if (strings[j].charAt(mid) == '1') ones++;
                    else zeros++;
                    if (strings[n - 1 - j].charAt(mid) == '1') ones++;
                    else zeros++;
                    ans[i] += Math.min(zeros, ones);
                }
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
