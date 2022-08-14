import java.util.Scanner;

public class SpecificTastesOfAndre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] numbers = new int[t];
        for (int i = 0; i < t; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}
