import java.util.Objects;
import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = input.next().toLowerCase();
        }
        for (int i = 0; i < n; i++) {
            if (Objects.equals(strings[i], "yes")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
