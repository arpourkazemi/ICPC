import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int tmp = 1;
        int cnt = 1;
        while (tmp <= n){
            cnt++;
            tmp += cnt * (cnt + 1) / 2;
        }
        System.out.println(--cnt);
    }
}
