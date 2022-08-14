import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();
        String third = input.next();
        int[] arr = new int[26];
        for (int i = 0; i < third.length(); i++) arr[third.charAt(i) - 65]++;
        for (int i = 0; i < first.length(); i++) arr[first.charAt(i) - 65]--;
        for (int i = 0; i < second.length(); i++) arr[second.charAt(i) - 65]--;
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
