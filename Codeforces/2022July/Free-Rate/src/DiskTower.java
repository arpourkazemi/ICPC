import java.util.Scanner;

public class DiskTower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean[] a = new boolean[n + 1];
        int p = n;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[nums[i]] = true;
            while (a[p]){
                System.out.print(p + " ");
                p--;
            }
            System.out.println();
        }
    }
}
