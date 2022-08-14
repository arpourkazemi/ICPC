import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int b = input.nextInt();
        int min = Math.min(r, b);
        int max = Math.max(r, b);
        System.out.println(min);
        System.out.println((max - min) / 2);
    }
}
