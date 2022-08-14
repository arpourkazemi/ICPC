import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Y = input.nextInt();
        int W = input.nextInt();
        int ans = 7 - Math.max(Y, W);
        switch (ans){
            case 1:
                System.out.println("1/6");
                break;
            case 2:
                System.out.println("1/3");
                break;
            case 3:
                System.out.println("1/2");
                break;
            case 4:
                System.out.println("2/3");
                break;
            case 5:
                System.out.println("5/6");
                break;
            case 6:
                System.out.println("1/1");
                break;
        }
    }
}
