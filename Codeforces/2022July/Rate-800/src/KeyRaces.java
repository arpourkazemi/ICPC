import java.util.Scanner;

public class KeyRaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int v1 = input.nextInt();
        int v2 = input.nextInt();
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int first = (2 * t1) + (v1 * s);
        int second = (2 * t2) + (v2 * s);
        if (first > second) System.out.println("Second");
        else if (second > first) System.out.println("First");
        else System.out.println("Friendship");
    }
}
