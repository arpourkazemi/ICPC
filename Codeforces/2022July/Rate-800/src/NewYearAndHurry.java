import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int sum = 240 - k;
        int ans = 0;
        int tmp = 5;
        while (true){
            if (ans < n && sum - tmp >= 0){
                sum -= tmp;
                tmp += 5;
                ans++;
            } else break;
        }
        System.out.println(ans);
    }
}
