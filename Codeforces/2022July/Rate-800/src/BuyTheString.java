import java.util.Scanner;

public class BuyTheString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int c0 = input.nextInt();
            int c1 = input.nextInt();
            int h = input.nextInt();
            String s = input.next();
            if (c1 > c0){
                if (c0 + h < c1) c1 = c0 + h;
            }else if (c1 < c0){
                if (c1 + h < c0) c0 = c1 + h;
            }
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') ans[i] += c1;
                else ans[i] += c0;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
