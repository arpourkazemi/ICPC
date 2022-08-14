import java.util.Scanner;

public class DigitMinimization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            long num = input.nextLong();
            if (num / 100 == 0) ans[i] = (int) (num % 10);
            else {
                int min = (int) (num % 10);
                while (num != 0) {
                    if (((int) (num % 10)) < min) min = (int) (num % 10);
                    num /= 10;
                }
                ans[i] = min;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
