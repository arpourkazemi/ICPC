import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long s = input.nextLong();
        if (s % n != 0) System.out.println((s/n) + 1);
        else System.out.println(s/n);
    }
}
