import java.util.Arrays;
import java.util.Scanner;

public class Promo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = input.nextInt();
        }
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = input.nextInt();
            queries[i][1] = input.nextInt();
        }
        Arrays.sort(p);
        int[] m = new int[p.length];
        for (int i = p.length - 1; i >= 0; i--) {
            m[p.length - i - 1] = p[i];
        }
        long[] sum = new long[n + 1];
        sum[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + m[i - 1];
        }
        for (int i = 0; i < q; i++) {
            System.out.println(sum[queries[i][0]] - sum[queries[i][0] - queries[i][1]]);
        }
    }
}