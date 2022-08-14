import java.util.Scanner;

public class XORMixup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            ans[i] = input.nextInt();
            for (int j = 1; j < n; j++) {
                input.nextInt();
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
