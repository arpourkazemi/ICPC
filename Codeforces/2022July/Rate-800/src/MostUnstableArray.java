import java.util.Scanner;

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long n = input.nextLong();
            long m = input.nextLong();
            if (n == 1L) System.out.println(0);
            else if (n == 2L) System.out.println(m);
            else System.out.println(2 * m);
        }
    }
}
