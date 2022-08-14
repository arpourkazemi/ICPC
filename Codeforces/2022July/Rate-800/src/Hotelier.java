import java.util.Scanner;

public class Hotelier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        boolean[] isFull = new boolean[10];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L'){
                isFull[getFirstEmptyLeft(isFull)] = true;
            }else if (s.charAt(i) == 'R'){
                isFull[getFirstEmptyRight(isFull)] = true;
            }else {
                int index = Integer.parseInt(s.substring(i, i + 1));
                isFull[index] = false;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (isFull[i]) System.out.print(1);
            else System.out.print(0);
        }
    }
    public static int getFirstEmptyLeft(boolean[] isFull){
        for (int i = 0; i < 10; i++) {
            if (!isFull[i]) return i;
        }
        return -1;
    }

    public static int getFirstEmptyRight(boolean[] isFull){
        for (int i = 9; i >= 0; i--) {
            if (!isFull[i]) return i;
        }
        return -1;
    }
}
