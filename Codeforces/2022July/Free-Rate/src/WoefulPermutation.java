import java.util.Scanner;

public class WoefulPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            if (n % 2 == 0){
                for (int j = 1; j <= n; j += 2) {
                    System.out.print((j + 1) + " " + j + " ");
                }
            } else {
                System.out.print(1 + " ");
                for (int j = 2; j < n; j += 2) {
                    System.out.print((j + 1) + " " + j + " ");
                }
            }
            System.out.println();
        }
    }
}
