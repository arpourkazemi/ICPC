import java.util.Scanner;

public class MarketingScheme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        for (int i = 0; i < t; i++) {
            int first = input.nextInt();
            int second = input.nextInt();
            ans[i] = (second < (first * 2));
        }
        for (int i = 0; i < t; i++) {
            if (ans[i]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
