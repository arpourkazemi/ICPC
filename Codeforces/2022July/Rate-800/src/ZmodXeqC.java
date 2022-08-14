import java.util.Scanner;

public class ZmodXeqC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[][] ans = new long[t][3];
        for (int i = 0; i < t; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            long c = input.nextLong();
            ans[i][0] = c + b + a;
            ans[i][1] = c + b;
            ans[i][2] = c;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1] + " " + ans[i][2]);
        }
    }
}
