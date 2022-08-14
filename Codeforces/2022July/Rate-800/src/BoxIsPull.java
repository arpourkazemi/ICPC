import java.util.Scanner;

public class BoxIsPull {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            long x1 = input.nextLong();
            long y1 = input.nextLong();
            long x2 = input.nextLong();
            long y2 = input.nextLong();
            if (x1 == x2 || y1 == y2) ans[i] = Math.abs(x1 - x2) + Math.abs(y1 - y2);
            else ans[i] = Math.abs(x1 - x2) + Math.abs(y1 - y2) + 2;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
