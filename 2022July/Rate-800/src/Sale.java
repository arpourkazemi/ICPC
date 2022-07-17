import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (a[i] > 0) break;
            sum += a[i];
        }
        System.out.println(-sum);
    }
}
