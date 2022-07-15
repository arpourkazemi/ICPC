import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        Arrays.sort(a);
        int index = ((n + 1) / 2) - 1;
        System.out.println(a[index]);
    }
}
