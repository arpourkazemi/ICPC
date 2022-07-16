import java.util.Arrays;
import java.util.Scanner;

public class ThreeStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        Arrays.fill(ans, true);
        for (int i = 0; i < t; i++) {
            String a = input.next();
            String b = input.next();
            String c = input.next();
            for (int j = 0; j < a.length(); j++) {
                if (c.charAt(j) != a.charAt(j) && c.charAt(j) != b.charAt(j)) {
                    ans[i] = false;
                    break;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            if (ans[i]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
