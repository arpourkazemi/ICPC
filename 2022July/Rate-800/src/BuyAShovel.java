import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int r = input.nextInt();
        int tmp = 0;
        int answer = 1;
        while (true){
            tmp += k;
            if (tmp % 10 == r || tmp % 10 == 0) break;
            answer++;
        }
        System.out.println(answer);
    }
}
