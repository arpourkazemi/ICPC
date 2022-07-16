import java.util.Scanner;

public class LCMProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long[][] ans = new long[t][2];
        for (int i = 0; i < t; i++) {
            long l = input.nextLong();
            long r = input.nextLong();
            if (l == 1 && r != 1){
                ans[i][0] = 1;
                ans[i][1] = r;
            }else if (r % l == 0){
                ans[i][0] = l;
                ans[i][1] = r;
            }else{
                if (l * 2 <= r){
                    ans[i][0] = l;
                    ans[i][1] = l * 2;
                }else {
                    ans[i][0] = -1;
                    ans[i][1] = -1;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}
