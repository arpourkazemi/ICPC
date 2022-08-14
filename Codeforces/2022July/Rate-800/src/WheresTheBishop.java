import java.util.Scanner;

public class WheresTheBishop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] ans = new int[t][2];
        test_case:
        for (int i = 0; i < t; i++) {
            String[] board = new String[8];
            for (int j = 0; j < 8; j++) {
                board[j] = input.next();
            }
            for (int j = 1; j < 7; j++) {
                for (int k = 1; k < 7; k++) {
                    if (board[j].charAt(k) == '#' && board[j - 1].charAt(k - 1) == '#' && board[j - 1].charAt(k + 1) == '#' && board[j + 1].charAt(k - 1) == '#' && board[j + 1].charAt(k + 1) == '#'){
                        ans[i][0] = j + 1;
                        ans[i][1] = k + 1;
                        continue test_case;
                    }
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}
