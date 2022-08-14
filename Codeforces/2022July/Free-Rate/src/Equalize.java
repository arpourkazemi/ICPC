import java.util.Scanner;

public class Equalize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String a = input.next();
        String b = input.next();
        int cost = 0;
        boolean lastChecked = false;
        for (int i = 0; i <  n - 1; i++) {
            if (a.charAt(i) != b.charAt(i)){
                cost++;
                if (a.charAt(i + 1) == b.charAt(i) && a.charAt(i) == b.charAt(i + 1)) {
                    i++;
                    if (i == n - 1) lastChecked = true;
                }
            }
        }
        if (!lastChecked && a.charAt(n - 1) != b.charAt(n - 1)) cost++;
        System.out.println(cost);
    }
}
