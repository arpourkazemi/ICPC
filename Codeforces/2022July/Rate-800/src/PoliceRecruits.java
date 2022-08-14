import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int officers = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmp = input.nextInt();
            if (tmp == -1){
                if (officers == 0) ans++;
                else officers--;
            } else officers += tmp;
        }
        System.out.println(ans);
    }
}
