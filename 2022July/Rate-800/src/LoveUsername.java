import java.util.Scanner;

public class LoveUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = input.nextInt();
        int min = max;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            int tmp = input.nextInt();
            if (tmp > max) {
                max = tmp;
                ans++;
            }
            if (tmp < min){
                min = tmp;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
