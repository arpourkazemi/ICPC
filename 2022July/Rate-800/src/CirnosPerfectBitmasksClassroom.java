import java.util.Scanner;

public class CirnosPerfectBitmasksClassroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] answer = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            if (n % 2 == 1){
                if (n == 1) answer[i] = 3;
                else answer[i] = 1;
            }else {
                int tmp = 0;
                while (n % 2 == 0 && n != 0){
                    n /= 2;
                    tmp++;
                }
                if (n == 1) answer[i] = ((int) Math.pow(2,tmp) + 1);
                else answer[i] = (int) Math.pow(2,tmp);
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }
}
