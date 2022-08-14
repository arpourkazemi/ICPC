import java.util.Scanner;

public class LoveTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] adj = new int[n];
        for (int i = 0; i < n; i++) {
            adj[i] = input.nextInt() - 1;
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (adj[adj[adj[i]]] == i){
                found = true;
                break;
            }
        }
        if (found) System.out.println("YES");
        else System.out.println("NO");
    }
}
