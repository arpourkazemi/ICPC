import java.util.Scanner;

public class KidsSeating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] numbers = new int[t];
        for (int i = 0; i < t; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int ans = numbers[i] * 4;
            while (numbers[i] > 0){
                System.out.print(ans + " ");
                ans -= 2;
                numbers[i]--;
            }
            System.out.println();
        }
    }
}
