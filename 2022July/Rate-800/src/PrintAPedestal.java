import java.util.Scanner;

public class PrintAPedestal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] ans = new int[t][3];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            if (n % 3 == 0){
                ans[i][0] = (n / 3);
                ans[i][1] = (n / 3) + 1;
                ans[i][2] = (n / 3) - 1;
            }else if (n % 3 == 1){
                n--;
                ans[i][0] = (n / 3);
                ans[i][1] = (n / 3) + 2;
                ans[i][2] = (n / 3) - 1;
            }else {
                n -= 2;
                ans[i][0] = (n / 3) + 1;
                ans[i][1] = (n / 3) + 2;
                ans[i][2] = (n / 3) - 1;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1] + " " + ans[i][2]);
        }
    }
}
