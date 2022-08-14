import java.util.Scanner;

public class FillingShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long ans = 0;
        if (n % 2 == 0) {
            ans = 1;
            for (int i = 0; i < n / 2; i++) {
                ans *= 2;
            }
        }
        System.out.println(ans);
    }
}
