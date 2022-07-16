import java.util.Scanner;

public class DistinctDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        while ((!f(Integer.toString(l))) && (l <= r)) l++;
        if (l > r) System.out.println(-1);
        else System.out.println(l);
    }

    public static boolean f (String number) {
        boolean[] digit = new boolean[10];
        for (int i = number.length() - 1; i > -1; i--) {
            int value = Integer.parseInt(number.substring(i, i + 1));
            if (digit[value]) return false;
            else digit[value] = true;
        }
        return true;
    }
}
