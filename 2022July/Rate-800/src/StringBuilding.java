import java.util.Arrays;
import java.util.Scanner;

public class StringBuilding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean[] ans = new boolean[t];
        Arrays.fill(ans, true);
        for (int i = 0; i < t; i++) {
            String s = input.next();
            if (s.length() == 1 || s.charAt(0) != s.charAt(1) || s.charAt(s.length() - 1) != s.charAt(s.length() - 2)) {
                ans[i] = false;
            }else {
                for (int j = 1; j < s.length() - 1; j++) {
                    if (s.charAt(j) != s.charAt(j + 1) && s.charAt(j) != s.charAt(j - 1)) {
                        ans[i] = false;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < t; i++) {
            if (ans[i]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
