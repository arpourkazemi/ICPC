import java.util.Scanner;

public class GregorAndThePawnGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            String enemyString = " " + input.next() + " ";
            char[] enemy = enemyString.toCharArray();
            String gregorString = " " + input.next();
            char[] gregor = gregorString.toCharArray();
            for (int j = 1; j <= n; j++) {
                if (gregor[j] == '1'){
                    if (enemy[j] == '0'){
                        ans[i]++;
                        enemy[j] = '2';
                    }else if (enemy[j - 1] == '1'){
                        enemy[j - 1] = '2';
                        ans[i]++;
                    }else if (enemy[j + 1] == '1'){
                        enemy[j + 1] = '2';
                        ans[i]++;
                    }
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
