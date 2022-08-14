import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        boolean shouldChange = true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < 65 || s.charAt(i) > 90) {
                shouldChange = false;
                break;
            }
        }
        if (!shouldChange) {
            System.out.println(s);
        } else {
            String ans = "";
            if (s.charAt(0) >= 97) ans += (char) (s.charAt(0) - 32);
            else ans += (char) (s.charAt(0) + 32);
            for (int i = 1; i < s.length(); i++) {
                ans += (char) (s.charAt(i) + 32);
            }
            System.out.println(ans);
        }
    }
}
