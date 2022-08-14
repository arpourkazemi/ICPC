import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            long n = input.nextLong();
            if (n < 3) ans[i] = 0;
            else {
                if (n % 2 == 0) n--;
                ans[i] = n / 2;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
