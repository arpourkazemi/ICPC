import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        ArrayList<String>[] ans = new ArrayList[t];
        for (int i = 0; i < t; i++) {
            ans[i] = new ArrayList<>();
            String s = input.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != '0') {
                    ans[i].add(s.substring(j, j + 1));
                    String tmp = "";
                    for (int k = 0; k < s.length() - j - 1; k++) tmp += "0";
                    int lastIndex = ans[i].size() - 1;
                    ans[i].set(lastIndex, ans[i].get(lastIndex) + tmp);
                }

            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i].size());
            for (int j = 0; j < ans[i].size(); j++) {
                System.out.print(ans[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
