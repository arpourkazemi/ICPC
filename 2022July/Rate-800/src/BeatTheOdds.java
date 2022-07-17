import java.util.Scanner;

public class BeatTheOdds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int odds = 0, evens = 0;
            for (int j = 0; j < n; j++) {
                if (input.nextInt()%2 == 0) evens++;
                else odds++;
            }
            ans[i] = Math.min(odds, evens);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
