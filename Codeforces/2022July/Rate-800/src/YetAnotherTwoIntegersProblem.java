import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[] ans = new long[t];
        for (int i = 0; i < t; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            if (a == b) ans[i] = 0;
            else if (a > b){
                ans[i] = a/10;
                ans[i] -= b/10;
                if (a%10 - b%10 > 0) ans[i]++;
            }else {
                ans[i] = b/10;
                ans[i] -= a/10;
                if (b%10 - a%10 > 0) ans[i]++;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
