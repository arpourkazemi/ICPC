import java.util.Scanner;

public class Creep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String[] ans = new String[t];
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            String answer = "";
            if (a > b){
                for (int j = 0; j < b; j++) {
                    answer += "01";
                }
                for (int j = 0; j < a - b; j++) {
                    answer += "0";
                }
            } else {
                for (int j = 0; j < a; j++) {
                    answer += "10";
                }
                for (int j = 0; j < b - a; j++) {
                    answer += "1";
                }
            }
            ans[i] = answer;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
