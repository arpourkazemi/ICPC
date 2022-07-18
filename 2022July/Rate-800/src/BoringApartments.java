import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int l = Integer.toString(n).length();
            ans[i] = (((n % 10) - 1)* 10) + (l * (l + 1) / 2);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
