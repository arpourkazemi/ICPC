import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        boolean[] used = new boolean[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }
        sum /= (n / 2);
        main_loop:
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (!used[j]) {
                    System.out.print(j + 1 + " ");
                    used[j] = true;
                    for (int k = j + 1; k < n; k++) {
                        if (!used[k] && a[k] + a[j] == sum){
                            System.out.println(k + 1);
                            used[k] = true;
                            continue main_loop;
                        }
                    }
                }
            }
        }
    }
}
