import java.util.Scanner;

public class Cypher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] ans = new int[t][];
        int[][] nums = new int[t][];
        String[][] chars = new String[t][];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            ans[i] = new int[n];
            nums[i] = new int[n];
            chars[i] = new String[n];
            for (int j = 0; j < n; j++) {
                nums[i][j] = input.nextInt();
            }
            for (int j = 0; j < n; j++) {
                int temp = input.nextInt();
                chars[i][j] = input.next();
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < chars[i][j].length(); k++) {
                    if (chars[i][j].charAt(k) == 'U'){
                        nums[i][j]--;
                    }else {
                        nums[i][j]++;
                    }
                }
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] %= 10;
                if (nums[i][j] < 0) nums[i][j] += 10;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
