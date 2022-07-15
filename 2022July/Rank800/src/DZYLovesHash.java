import java.util.Scanner;

public class DZYLovesHash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int n = input.nextInt();
        boolean[] hash = new boolean[p];
        for (int i = 0; i < n; i++) {
            long num = input.nextLong();
            if (!hash[(int) (num%p)]) hash[(int) (num%p)] = true;
            else {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
