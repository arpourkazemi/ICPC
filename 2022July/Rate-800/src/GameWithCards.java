import java.util.Scanner;

public class GameWithCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[][] ans = new boolean[t][2];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int A_max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                int tmp = input.nextInt();
                if (tmp > A_max) A_max = tmp;
            }
            int m = input.nextInt();
            int B_max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                int tmp = input.nextInt();
                if (tmp > B_max) B_max = tmp;
            }
            if (A_max > B_max) {
                ans[i][0] = true;
                ans[i][1] = true;
            } else if (A_max == B_max) {
                ans[i][0] = true;
                ans[i][1] = false;
            } else {
                ans[i][0] = false;
                ans[i][1] = false;
            }
        }
        for (int i = 0; i < t; i++) {
            if (ans[i][0]) System.out.println("Alice");
            else System.out.println("Bob");
            if (ans[i][1]) System.out.println("Alice");
            else System.out.println("Bob");
        }
    }
}
