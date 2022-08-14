import java.util.HashMap;
import java.util.Scanner;

public class ICPCBallons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            String str = input.next();
            HashMap<Character, Boolean> hash = new HashMap<>();
            ans[i] = n;
            for (int j = 0; j < n; j++) {
                if (!hash.containsKey(str.charAt(j))) {
                    hash.put(str.charAt(j), true);
                    ans[i]++;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
