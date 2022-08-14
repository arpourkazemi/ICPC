import java.util.Scanner;

public class SubRectangleGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            long max = Long.MIN_VALUE;
            int row = 0, col = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    long tmp = input.nextLong();
                    if (max < tmp){
                        row = j;
                        col = k;
                        max = tmp;
                    }
                }
            }
            int maxRow = n - row;
            if ((row + 1) > maxRow) maxRow = row + 1;
            int maxCol = m - col;
            if ((col + 1) > maxCol) maxCol = col + 1;
            ans[i] = maxCol * maxRow;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
