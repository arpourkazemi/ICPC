import java.util.Scanner;

public class BearAndForgottonTree {
    public static boolean[] visited;
    public static boolean[][] isNotAdj;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        isNotAdj = new boolean[n][n];
        int count1s = 0;
        for (int i = 0; i < m; i++) {
            int first = input.nextInt();
            int second = input.nextInt();
            isNotAdj[first - 1][second - 1] = true;
            isNotAdj[second - 1][first - 1] = true;
            if (first == 1 || second == 1) count1s++;
        }
        if (count1s > (n - 1 - k)) {
            System.out.println("impossible");
        }else {
            visited = new boolean[n];
            dfs(m);
            int counter = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) counter++;
            }
            if (counter == n) System.out.println("possible");
            else System.out.println("impossible");
        }

    }

    public static void dfs(int v) {
        visited[v] = true;
        for (int i = 0; i < visited.length; i++) {
            if (!isNotAdj[i][v]) {
                if (!visited[i]) {
                    dfs(i);
                }
            }
        }
    }
}
