import java.util.Scanner;

public class MedianMaximization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            long n = input.nextLong();
            long s = input.nextLong();
            if (n % 2 == 0) n++;
            n -= (n/2);
            ans[i] = s/n;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
